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


@Module
 class ApplicationModule(val app: Application) {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return app
    }

    @Singleton
    @Provides
    fun provideApplication(): Application {
        return app
    }

    @Singleton
    @Provides
    fun getEventBus(): EventBus = EventBus.getDefault()


}