package com.pmpavan.githubpullrequests.viewmodel.uistate

import android.databinding.ObservableArrayList
import javax.inject.Inject

class PullRequestUiState @Inject constructor() {
    val items: ObservableArrayList<PullRequestListItemUiState> = ObservableArrayList()

    fun update(stateList: MutableList<PullRequestListItemUiState>) {
        items.clear()
        items.addAll(stateList)
    }
}
