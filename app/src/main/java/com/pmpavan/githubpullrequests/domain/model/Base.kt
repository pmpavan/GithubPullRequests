package com.pmpavan.githubpullrequests.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Base {
    @SerializedName("label")
    @Expose
    private var label: String? = null
    @SerializedName("ref")
    @Expose
    private var ref: String? = null
    @SerializedName("sha")
    @Expose
    private var sha: String? = null
    @SerializedName("user")
    @Expose
    private var user: User? = null
    @SerializedName("repo")
    @Expose
    private var repo: Repo? = null

    fun getLabel(): String? {
        return label
    }

    fun setLabel(label: String) {
        this.label = label
    }

    fun getRef(): String? {
        return ref
    }

    fun setRef(ref: String) {
        this.ref = ref
    }

    fun getSha(): String? {
        return sha
    }

    fun setSha(sha: String) {
        this.sha = sha
    }

    fun getUser(): User? {
        return user
    }

    fun setUser(user: User) {
        this.user = user
    }

    fun getRepo(): Repo? {
        return repo
    }

    fun setRepo(repo: Repo) {
        this.repo = repo
    }

    override fun toString(): String {
        return "Base(label=$label, ref=$ref, sha=$sha, user=$user, repo=$repo)"
    }


}