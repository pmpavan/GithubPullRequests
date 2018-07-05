package com.pmpavan.githubpullrequests.domain.interactor.impl

import com.pmpavan.githubpullrequests.data.GithubApi
import com.pmpavan.githubpullrequests.domain.interactor.GithubInteractor
import com.pmpavan.githubpullrequests.domain.model.GithubPullsResponse
import io.reactivex.Single
import javax.inject.Inject

class GithubInteractorImpl @Inject constructor(val githubApi: GithubApi) : GithubInteractor {
    override fun getPullRequestsFromApi(userName: String, projectName: String, state: String): Single<List<GithubPullsResponse>> {
        return githubApi.getPullRequestsFromApi(userName, projectName, state)
    }
}