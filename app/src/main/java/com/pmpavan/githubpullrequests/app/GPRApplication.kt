package com.pmpavan.githubpullrequests.app

import android.app.Activity
import android.app.Application
import android.content.Context
import com.pmpavan.githubpullrequests.app.di.component.ApplicationComponent
import com.pmpavan.githubpullrequests.app.di.component.DaggerApplicationComponent
import com.pmpavan.githubpullrequests.app.di.module.ApplicationModule
import com.pmpavan.githubpullrequests.app.di.module.NetModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class GPRApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }


    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .netModule(NetModule(AppConstants.BASE_URL))
                .build()
                .inject(this)
    }


    operator fun get(context: Context): GPRApplication {
        return context.applicationContext as GPRApplication
    }

}