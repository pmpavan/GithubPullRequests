package com.pmpavan.githubpullrequests.app.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.pmpavan.githubpullrequests.app.di.scope.ViewModelKey
import com.pmpavan.githubpullrequests.viewmodel.PullRequestViewModel
import com.pmpavan.githubpullrequests.viewmodel.base.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseActivityModule::class])
abstract class GithubActivityModule {
//    @Binds
//    @ActivityScope
//    abstract fun activity(mainActivity: GithubActivity): Context

    @Binds
    @IntoMap
    @ViewModelKey(PullRequestViewModel::class)
    abstract fun bindPullRequestViewModel(model: PullRequestViewModel): ViewModel

    @Binds
    abstract fun bindPullRequestViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}

