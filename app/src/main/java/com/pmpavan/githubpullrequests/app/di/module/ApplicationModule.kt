package com.pmpavan.githubpullrequests.app.di.module

import android.app.Application
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import com.pmpavan.githubpullrequests.app.AppConstants
import com.pmpavan.githubpullrequests.app.di.scope.ActivityScope
import com.pmpavan.githubpullrequests.viewmodel.PullRequestViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import org.greenrobot.eventbus.EventBus
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
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

//    @Singleton
//    @Provides
//    fun getNetworkProvider(): Retrofit {
//        return Retrofit.Builder()
//                .baseUrl(AppConstants.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build()
//    }

//    @Provides
//    fun providePullRequestFactory(context: Context, eventBus: EventBus): ViewModelProvider.Factory {
//        return PullRequestViewModel.Factory(context, eventBus)
//    }
}