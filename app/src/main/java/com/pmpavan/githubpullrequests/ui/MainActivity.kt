package com.pmpavan.githubpullrequests.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.widget.Toast
import com.pmpavan.githubpullrequests.R
import com.pmpavan.githubpullrequests.databinding.ActivityMainBinding
import com.pmpavan.githubpullrequests.ui.base.BaseActivity
import com.pmpavan.githubpullrequests.viewmodel.PullRequestViewModel
import com.pmpavan.githubpullrequests.viewmodel.constants.PullRequestConstants
import com.pmpavan.githubpullrequests.viewmodel.events.MainActivityEvent
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var eventBus: EventBus

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    private lateinit var viewDataBinding: ActivityMainBinding
    private lateinit var viewModel: PullRequestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        invokeDataBinding()
    }


    private fun invokeDataBinding() {
        viewModel = ViewModelProviders.of(this@MainActivity, factory).get(PullRequestViewModel::class.java)
        viewDataBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        viewDataBinding.vm = viewModel
        viewDataBinding.executePendingBindings()
    }

    override fun onStart() {
        super.onStart()
        registerForEvents(eventBus)
    }

    override fun onStop() {
        super.onStop()
        unregisterForEvents(eventBus)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onViewModelInteraction(mainActivityEvent: MainActivityEvent) {
        when(mainActivityEvent.id){
            PullRequestConstants.ON_SEARCH_CLICKED->{
                Toast.makeText(this@MainActivity,mainActivityEvent.message,Toast.LENGTH_SHORT).show()
            }
        }
    }
}
