package com.pmpavan.githubpullrequests.data

import com.pmpavan.githubpullrequests.domain.model.GithubPullsResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface GithubApiService {

    @GET("repos/{userName}/{projectName}/pulls")
    fun getGithubPullRequets(@Path("userName") userName: String, @Path("projectName") projectName: String, @Query("state") state: String): Single<GithubPullsResponse>
}