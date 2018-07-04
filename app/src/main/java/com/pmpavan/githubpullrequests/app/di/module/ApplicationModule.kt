package com.pmpavan.githubpullrequests.app.di.module

import android.app.Application
import android.content.Context
import com.pmpavan.githubpullrequests.app.GPRApplication
import com.pmpavan.githubpullrequests.app.di.scope.ActivityScope
import com.pmpavan.githubpullrequests.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import org.greenrobot.eventbus.EventBus
import javax.inject.Singleton


@Module(includes = [AndroidInjectionModule::class])
abstract class ApplicationModule(app: Application) {

    private var mApplication: Application = app


    @Binds
    @Singleton
    abstract fun application(app: GPRApplication): Application

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivityInjector(): MainActivity

//    @Singleton
//    @Provides
//    fun provideContext(): Context {
//        return mApplication
//    }
//
//    @Singleton
//    @Provides
//    fun provideApplication(): Application {
//        return mApplication
//    }
//
//    @Singleton
//    @Provides
//    abstract fun getEventBus(): EventBus
}