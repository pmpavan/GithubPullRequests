package com.pmpavan.githubpullrequests.ui

import android.os.Bundle
import com.pmpavan.githubpullrequests.R
import com.pmpavan.githubpullrequests.ui.base.BaseActivity
import com.pmpavan.githubpullrequests.viewmodel.events.MainActivityEvent
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var eventBus: EventBus

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

    }
}
