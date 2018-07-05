package com.pmpavan.githubpullrequests.viewmodel

import android.content.Context
import android.databinding.ObservableField
import android.util.Log
import com.pmpavan.githubpullrequests.domain.interactor.GithubInteractor
import com.pmpavan.githubpullrequests.viewmodel.base.BaseViewModel
import com.pmpavan.githubpullrequests.viewmodel.constants.PullRequestConstants
import com.pmpavan.githubpullrequests.viewmodel.events.MainActivityEvent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class PullRequestViewModel @Inject constructor(var context: Context, var eventBus: EventBus, val githubInteractor: GithubInteractor) : BaseViewModel() {

    var searchTxt = ObservableField<String>("")

    fun onSearchClicked() {
        val mainActivityEvent = MainActivityEvent()
        mainActivityEvent.id = PullRequestConstants.ON_SEARCH_CLICKED
        mainActivityEvent.message = searchTxt.get()!!
        eventBus.post(mainActivityEvent)

        githubInteractor.getPullRequestsFromApi("pmpavan", "CoinToss", "open")
                .map { Log.i("RESULT", "respopnse " + it.toString()) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(Consumer {
                    Log.i("RESULT", "respopnse " + it.toString())
                }, Consumer {
                    Log.i("RESULT", "respopnse failure " + it.toString())
                })
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