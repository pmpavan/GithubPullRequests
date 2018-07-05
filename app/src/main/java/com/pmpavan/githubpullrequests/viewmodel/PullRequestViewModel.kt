package com.pmpavan.githubpullrequests.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.databinding.ObservableField
import android.util.Log
import com.pmpavan.githubpullrequests.domain.interactor.GithubInteractor
import com.pmpavan.githubpullrequests.viewmodel.base.BaseViewModel
import com.pmpavan.githubpullrequests.viewmodel.uistate.PullRequestListItemUiState
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class PullRequestViewModel @Inject constructor(var context: Context, var eventBus: EventBus, val githubInteractor: GithubInteractor) : BaseViewModel(),PullRequestListItemUiState.PullRequestItemClickHandler {


    var searchTxt = ObservableField<String>("")

    val data = MutableLiveData<MutableList<PullRequestListItemUiState>>()
    private val items = mutableListOf<PullRequestListItemUiState>()

    fun onSearchClicked() {
//        val mainActivityEvent = MainActivityEvent()
//        mainActivityEvent.id = PullRequestConstants.ON_SEARCH_CLICKED
//        mainActivityEvent.message = searchTxt.get()!!
//        eventBus.post(mainActivityEvent)
        val text = searchTxt.get()!!.split("/")

        githubInteractor.getPullRequestsFromApi(text[0], text[1], "open")
                .toObservable()
                .concatMapIterable { t -> t }
                .concatMap { t ->
                    val uiState = PullRequestListItemUiState()
                    uiState.id = t.getId()!!
                    uiState.title = t.getTitle()
                    return@concatMap Observable.just(uiState)
                }
                .toList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    populateListView(it)
                }, {
                    Log.e("RESULT", "respopnse failure " + it.toString())
                })
    }


    private fun populateListView(it: MutableList<PullRequestListItemUiState>) {
        items.clear()
        items.addAll(it)
        Log.i("RESULT", "respopnse " + it.toString())
        data.postValue(items)
    }


    override fun onItemClick(position: Int, model: PullRequestListItemUiState) {

        Log.i("OnItemClick", "item $model")

    }


//    class Factory(private val context: Context, private val eventBus: EventBus/*, private val githubInteractor: GithubInteractor*/) : ViewModelProvider.Factory {
//
//        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//            if (modelClass.isAssignableFrom(PullRequestViewModel::class.java)) {
//                return PullRequestViewModel(context, eventBus/*, *githubInteractor*/) as T
//            }
//            throw IllegalArgumentException("Unknown class name")
//        }
//    }
}