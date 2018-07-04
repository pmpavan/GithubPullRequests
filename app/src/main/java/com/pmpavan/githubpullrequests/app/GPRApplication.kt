package com.pmpavan.githubpullrequests.app

import android.app.Activity
import android.app.Application
import android.content.Context
import com.pmpavan.githubpullrequests.app.di.component.ApplicationComponent
import com.pmpavan.githubpullrequests.app.di.component.DaggerApplicationComponent
import com.pmpavan.githubpullrequests.app.di.module.ApplicationModule
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject


class GPRApplication : Application(), HasActivityInjector {
    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }

    companion object {
        @JvmStatic
        lateinit var applicationComponent: ApplicationComponent
    }

    operator fun get(context: Context): GPRApplication {
        return context.applicationContext as GPRApplication
    }

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.builder().create(this).inject(this)
    }

    fun getComponent(): ApplicationComponent {
        return applicationComponent
    }
}