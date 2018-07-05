package com.pmpavan.githubpullrequests.viewmodel.binding

import android.databinding.BindingAdapter
import android.view.View

object ListBindingAdapters {

    @BindingAdapter("android:onClick")
    @JvmStatic
    fun View.setClickListener(handler: ClickHandler) {
        setOnClickListener { _ -> handler.onClick() }
    }

    interface ClickHandler {
        fun onClick()
    }
}