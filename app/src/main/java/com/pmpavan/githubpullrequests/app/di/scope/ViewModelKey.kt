package com.pmpavan.githubpullrequests.app.di.scope

import dagger.MapKey
import android.arch.lifecycle.ViewModel
import kotlin.reflect.KClass

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)
