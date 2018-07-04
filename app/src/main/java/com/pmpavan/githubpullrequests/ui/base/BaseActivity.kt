package com.pmpavan.githubpullrequests.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import org.greenrobot.eventbus.EventBus

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    fun registerForEvents(eventBus :EventBus){
        eventBus.register(this)
    }

    fun unregisterForEvents(eventBus :EventBus){
        eventBus.unregister(this)
    }
}