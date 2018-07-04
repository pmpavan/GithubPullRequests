package com.pmpavan.githubpullrequests.app.di.component

import com.pmpavan.githubpullrequests.app.GPRApplication
import com.pmpavan.githubpullrequests.app.di.module.ActivityModule
import com.pmpavan.githubpullrequests.app.di.module.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class, AndroidInjectionModule::class, ActivityModule::class])
interface ApplicationComponent {

    fun inject(app: GPRApplication)

    //    fun getContext(): Context
//
//    fun getApplication(): GPRApplication
//

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