package com.pmpavan.githubpullrequests.domain.interactor

import com.pmpavan.githubpullrequests.domain.model.GithubPullsResponse
import io.reactivex.Single

interface GithubInteractor {

    fun getPullRequestsFromApi(userName: String, projectName: String, state: String): Single<List<GithubPullsResponse>>

}