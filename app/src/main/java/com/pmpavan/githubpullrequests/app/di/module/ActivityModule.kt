package com.pmpavan.githubpullrequests.app.di.module

import com.pmpavan.githubpullrequests.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivity(): MainActivity


}