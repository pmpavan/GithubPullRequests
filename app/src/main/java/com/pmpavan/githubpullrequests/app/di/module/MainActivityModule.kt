package com.pmpavan.githubpullrequests.app.di.module

import android.app.Activity
import com.pmpavan.githubpullrequests.app.di.scope.ActivityScope
import com.pmpavan.githubpullrequests.ui.MainActivity
import dagger.Binds
import dagger.Module

@Module(includes = [BaseActivityModule::class])
abstract class MainActivityModule {
    @Binds
    @ActivityScope
    abstract fun activity(mainActivity: MainActivity): Activity
}