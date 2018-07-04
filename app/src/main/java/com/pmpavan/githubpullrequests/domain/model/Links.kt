package com.pmpavan.githubpullrequests.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Links {
    @SerializedName("self")
    @Expose
    private var self: Self? = null
    @SerializedName("html")
    @Expose
    private var html: Html? = null
    @SerializedName("issue")
    @Expose
    private var issue: Issue? = null
    @SerializedName("comments")
    @Expose
    private var comments: Comments? = null
    @SerializedName("review_comments")
    @Expose
    private var reviewComments: ReviewComment? = null
    @SerializedName("review_comment")
    @Expose
    private var reviewComment: ReviewComment? = null
    @SerializedName("commits")
    @Expose
    private var commits: Commits? = null
    @SerializedName("statuses")
    @Expose
    private var statuses: Statuses? = null

    fun getSelf(): Self? {
        return self
    }

    fun setSelf(self: Self) {
        this.self = self
    }

    fun getHtml(): Html? {
        return html
    }

    fun setHtml(html: Html) {
        this.html = html
    }

    fun getIssue(): Issue? {
        return issue
    }

    fun setIssue(issue: Issue) {
        this.issue = issue
    }

    fun getComments(): Comments? {
        return comments
    }

    fun setComments(comments: Comments) {
        this.comments = comments
    }

    fun getReviewComments(): ReviewComment? {
        return reviewComments
    }

    fun setReviewComments(reviewComments: ReviewComment) {
        this.reviewComments = reviewComments
    }

    fun getReviewComment(): ReviewComment? {
        return reviewComment
    }

    fun setReviewComment(reviewComment: ReviewComment) {
        this.reviewComment = reviewComment
    }

    fun getCommits(): Commits? {
        return commits
    }

    fun setCommits(commits: Commits) {
        this.commits = commits
    }

    fun getStatuses(): Statuses? {
        return statuses
    }

    fun setStatuses(statuses: Statuses) {
        this.statuses = statuses
    }

}