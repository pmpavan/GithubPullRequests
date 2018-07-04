package com.pmpavan.githubpullrequests.app.di.component

import android.app.Application
import com.pmpavan.githubpullrequests.app.GPRApplication
import com.pmpavan.githubpullrequests.app.di.module.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent : AndroidInjector<GPRApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<GPRApplication>()

//    fun getContext(): Context
//
//    fun getApplication(): GPRApplication
//
    fun inject(app: Application)

//    override fun inject(instance: DaggerApplication)
//
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: Application): Builder
//
//        fun build(): ApplicationComponent
//    }
}