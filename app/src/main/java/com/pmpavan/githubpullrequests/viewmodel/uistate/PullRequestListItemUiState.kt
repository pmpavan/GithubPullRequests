package com.pmpavan.githubpullrequests.viewmodel.uistate

import android.os.Parcel
import android.os.Parcelable

class PullRequestListItemUiState() : Parcelable {
    interface PullRequestItemClickHandler {
        fun onItemClick(position: Int, model: PullRequestListItemUiState)
    }

     var title: String? = ""
     var id: Long = -1L
     var handler: PullRequestItemClickHandler? = null

    constructor(parcel: Parcel) : this() {
        title = parcel.readString()
        id = parcel.readLong()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeLong(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "PullRequestListItemUiState(title=$title, id=$id, handler=$handler)"
    }

    companion object CREATOR : Parcelable.Creator<PullRequestListItemUiState> {
        override fun createFromParcel(parcel: Parcel): PullRequestListItemUiState {
            return PullRequestListItemUiState(parcel)
        }

        override fun newArray(size: Int): Array<PullRequestListItemUiState?> {
            return arrayOfNulls(size)
        }
    }


}