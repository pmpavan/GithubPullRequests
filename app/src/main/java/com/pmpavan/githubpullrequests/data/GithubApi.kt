package com.pmpavan.githubpullrequests.data

import com.pmpavan.githubpullrequests.data.base.BaseApi
import com.pmpavan.githubpullrequests.domain.model.GithubPullsResponse
import io.reactivex.Single
import javax.inject.Inject

class GithubApi @Inject constructor(val apiInterface: GithubApiService) : BaseApi() {

    fun getPullRequestsFromApi(userName: String, projectName: String, state: String): Single<GithubPullsResponse> {
        return apiInterface.getGithubPullRequets(userName, projectName, state)
    }
}