package com.pmpavan.githubpullrequests.app.di.module

import android.app.Activity
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import com.pmpavan.githubpullrequests.app.di.scope.ActivityScope
import com.pmpavan.githubpullrequests.app.di.scope.ViewModelKey
import com.pmpavan.githubpullrequests.ui.MainActivity
import com.pmpavan.githubpullrequests.viewmodel.PullRequestViewModel
import com.pmpavan.githubpullrequests.viewmodel.base.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Provider

@Module(includes = [BaseActivityModule::class])
abstract class MainActivityModule {
//    @Binds
//    @ActivityScope
//    abstract fun activity(mainActivity: MainActivity): Context

    @Binds
    @IntoMap
    @ViewModelKey(PullRequestViewModel::class)
    abstract fun bindHomeViewModel(model: PullRequestViewModel): ViewModel

    @Binds
    abstract fun bindAppViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
//    @Binds
//    @ActivityScope
//    abstract fun providePullRequestFactory(pullRequestViewModel: PullRequestViewModel): ViewModelProvider.Factory

}

