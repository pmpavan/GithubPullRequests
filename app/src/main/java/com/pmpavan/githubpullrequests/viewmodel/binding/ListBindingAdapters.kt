package com.pmpavan.githubpullrequests.viewmodel.binding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.view.View
import com.pmpavan.githubpullrequests.viewmodel.PullRequestListAdapter
import com.pmpavan.githubpullrequests.viewmodel.uistate.PullRequestListItemUiState
import java.util.ArrayList

object ListBindingAdapters {

    @BindingAdapter("android:onClick")
    @JvmStatic
    fun View.setClickListener(handler: ClickHandler) {
        setOnClickListener { _ -> handler.onClick() }
    }

    interface ClickHandler {
        fun onClick()
    }

    @BindingAdapter("items")
    @JvmStatic
    fun RecyclerView.setChatAdapter(items: MutableList<PullRequestListItemUiState>?) {
        if (adapter != null) {
            val listAdapter = adapter as PullRequestListAdapter
            listAdapter.clear()
            if (items != null)
                listAdapter.addAll(items)
            listAdapter.notifyDataSetChanged()
        }
    }

    @BindingAdapter("android:visibility")
    @JvmStatic
    fun View.setVisibility(visible: Boolean) {
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}