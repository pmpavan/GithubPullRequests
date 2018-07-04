package com.pmpavan.githubpullrequests.app.di.module

import dagger.Module
import android.app.Activity
import android.content.Context
import com.pmpavan.githubpullrequests.app.di.scope.ActivityScope
import dagger.Provides
import dagger.android.AndroidInjectionModule


@Module(includes = [AndroidInjectionModule::class])
abstract class ActivityModule {

    private lateinit var mActivity: Activity

    fun ActivityModule(activity: Activity) {
        mActivity = activity
    }

    @Provides
    @ActivityScope
    fun provideContext(): Context {
        return mActivity
    }

    @Provides
    fun provideActivity(): Activity {
        return mActivity
    }
}