package com.pmpavan.githubpullrequests.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Issue{
    @SerializedName("href")
    @Expose
    private var href: String? = null

    fun getHref(): String? {
        return href
    }

    fun setHref(href: String) {
        this.href = href
    }
}