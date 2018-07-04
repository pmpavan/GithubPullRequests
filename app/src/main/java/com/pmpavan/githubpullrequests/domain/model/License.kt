package com.pmpavan.githubpullrequests.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class License {
    @SerializedName("key")
    @Expose
    private var key: String? = null
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("spdx_id")
    @Expose
    private var spdxId: String? = null
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("node_id")
    @Expose
    private var nodeId: String? = null

    fun getKey(): String? {
        return key
    }

    fun setKey(key: String) {
        this.key = key
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getSpdxId(): String? {
        return spdxId
    }

    fun setSpdxId(spdxId: String) {
        this.spdxId = spdxId
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getNodeId(): String? {
        return nodeId
    }

    fun setNodeId(nodeId: String) {
        this.nodeId = nodeId
    }
}