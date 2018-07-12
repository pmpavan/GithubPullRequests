package com.pmpavan.githubpullrequests.app.di.module

import com.pmpavan.githubpullrequests.ui.GithubActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [GithubActivityModule::class])
    abstract fun contributeMainActivity(): GithubActivity


}