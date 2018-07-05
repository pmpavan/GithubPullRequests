package com.pmpavan.githubpullrequests.app.di.component

import com.pmpavan.githubpullrequests.app.GPRApplication
import com.pmpavan.githubpullrequests.app.di.module.ActivityModule
import com.pmpavan.githubpullrequests.app.di.module.ApplicationModule
import com.pmpavan.githubpullrequests.app.di.module.NetModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class, AndroidInjectionModule::class, ActivityModule::class, NetModule::class])
interface ApplicationComponent {

    fun inject(app: GPRApplication)
}