package com.pmpavan.githubpullrequests.ui

import android.app.Fragment
import android.os.Bundle
import com.pmpavan.githubpullrequests.R
import com.pmpavan.githubpullrequests.app.GPRApplication
import com.pmpavan.githubpullrequests.ui.base.BaseActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import org.greenrobot.eventbus.EventBus
import java.security.AccessController.getContext
import javax.inject.Inject

class MainActivity : BaseActivity() {

//    @Inject
//    lateinit var eventBus: EventBus

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        GPRApplication.applicationComponent
//                .newActivityComponentBuilder()
//                .activity(this)
//                .build()
//                .inject(this@MainActivity)
    }

}
