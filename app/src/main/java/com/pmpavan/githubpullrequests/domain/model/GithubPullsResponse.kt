package com.pmpavan.githubpullrequests.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class GithubPullsResponse {

    @SerializedName(value = "message")
    @Expose
    private var message: String? = null
    @SerializedName("documentation_url")
    @Expose
    private var documentationUrl: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("id")
    @Expose
    private var id: Long? = null
    @SerializedName("node_id")
    @Expose
    private var nodeId: String? = null
    @SerializedName("html_url")
    @Expose
    private var htmlUrl: String? = null
    @SerializedName("diff_url")
    @Expose
    private var diffUrl: String? = null
    @SerializedName("patch_url")
    @Expose
    private var patchUrl: String? = null
    @SerializedName("issue_url")
    @Expose
    private var issueUrl: String? = null
    @SerializedName("number")
    @Expose
    private var number: Long? = null
    @SerializedName("state")
    @Expose
    private var state: String? = null
    @SerializedName("locked")
    @Expose
    private var locked: Boolean? = null
    @SerializedName("title")
    @Expose
    private var title: String? = null
    @SerializedName("user")
    @Expose
    private var user: User? = null
    @SerializedName("body")
    @Expose
    private var body: String? = null
    @SerializedName("created_at")
    @Expose
    private var createdAt: String? = null
    @SerializedName("updated_at")
    @Expose
    private var updatedAt: String? = null
    @SerializedName("closed_at")
    @Expose
    private var closedAt: Any? = null
    @SerializedName("merged_at")
    @Expose
    private var mergedAt: Any? = null
    @SerializedName("merge_commit_sha")
    @Expose
    private var mergeCommitSha: String? = null
    @SerializedName("assignee")
    @Expose
    private var assignee: Any? = null
    @SerializedName("assignees")
    @Expose
    private var assignees: List<Any>? = null
    @SerializedName("requested_reviewers")
    @Expose
    private var requestedReviewers: List<Any>? = null
    @SerializedName("requested_teams")
    @Expose
    private var requestedTeams: List<Any>? = null
    @SerializedName("labels")
    @Expose
    private var labels: List<Any>? = null
    @SerializedName("milestone")
    @Expose
    private var milestone: Any? = null
    @SerializedName("commits_url")
    @Expose
    private var commitsUrl: String? = null
    @SerializedName("review_comments_url")
    @Expose
    private var reviewCommentsUrl: String? = null
    @SerializedName("review_comment_url")
    @Expose
    private var reviewCommentUrl: String? = null
    @SerializedName("comments_url")
    @Expose
    private var commentsUrl: String? = null
    @SerializedName("statuses_url")
    @Expose
    private var statusesUrl: String? = null
    @SerializedName("head")
    @Expose
    private var head: Head? = null
    @SerializedName("base")
    @Expose
    private var base: Base? = null
    @SerializedName("_links")
    @Expose
    private var links: Links? = null
    @SerializedName("author_association")
    @Expose
    private var authorAssociation: String? = null

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getId(): Long? {
        return id
    }

    fun setId(id: Long?) {
        this.id = id
    }

    fun getNodeId(): String? {
        return nodeId
    }

    fun setNodeId(nodeId: String) {
        this.nodeId = nodeId
    }

    fun getHtmlUrl(): String? {
        return htmlUrl
    }

    fun setHtmlUrl(htmlUrl: String) {
        this.htmlUrl = htmlUrl
    }

    fun getDiffUrl(): String? {
        return diffUrl
    }

    fun setDiffUrl(diffUrl: String) {
        this.diffUrl = diffUrl
    }

    fun getPatchUrl(): String? {
        return patchUrl
    }

    fun setPatchUrl(patchUrl: String) {
        this.patchUrl = patchUrl
    }

    fun getIssueUrl(): String? {
        return issueUrl
    }

    fun setIssueUrl(issueUrl: String) {
        this.issueUrl = issueUrl
    }

    fun getNumber(): Long? {
        return number
    }

    fun setNumber(number: Long?) {
        this.number = number
    }

    fun getState(): String? {
        return state
    }

    fun setState(state: String) {
        this.state = state
    }

    fun getLocked(): Boolean? {
        return locked
    }

    fun setLocked(locked: Boolean?) {
        this.locked = locked
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getUser(): User? {
        return user
    }

    fun setUser(user: User) {
        this.user = user
    }

    fun getBody(): String? {
        return body
    }

    fun setBody(body: String) {
        this.body = body
    }

    fun getCreatedAt(): String? {
        return createdAt
    }

    fun setCreatedAt(createdAt: String) {
        this.createdAt = createdAt
    }

    fun getUpdatedAt(): String? {
        return updatedAt
    }

    fun setUpdatedAt(updatedAt: String) {
        this.updatedAt = updatedAt
    }

    fun getClosedAt(): Any? {
        return closedAt
    }

    fun setClosedAt(closedAt: Any) {
        this.closedAt = closedAt
    }

    fun getMergedAt(): Any? {
        return mergedAt
    }

    fun setMergedAt(mergedAt: Any) {
        this.mergedAt = mergedAt
    }

    fun getMergeCommitSha(): String? {
        return mergeCommitSha
    }

    fun setMergeCommitSha(mergeCommitSha: String) {
        this.mergeCommitSha = mergeCommitSha
    }

    fun getAssignee(): Any? {
        return assignee
    }

    fun setAssignee(assignee: Any) {
        this.assignee = assignee
    }

    fun getAssignees(): List<Any>? {
        return assignees
    }

    fun setAssignees(assignees: List<Any>) {
        this.assignees = assignees
    }

    fun getRequestedReviewers(): List<Any>? {
        return requestedReviewers
    }

    fun setRequestedReviewers(requestedReviewers: List<Any>) {
        this.requestedReviewers = requestedReviewers
    }

    fun getRequestedTeams(): List<Any>? {
        return requestedTeams
    }

    fun setRequestedTeams(requestedTeams: List<Any>) {
        this.requestedTeams = requestedTeams
    }

    fun getLabels(): List<Any>? {
        return labels
    }

    fun setLabels(labels: List<Any>) {
        this.labels = labels
    }

    fun getMilestone(): Any? {
        return milestone
    }

    fun setMilestone(milestone: Any) {
        this.milestone = milestone
    }

    fun getCommitsUrl(): String? {
        return commitsUrl
    }

    fun setCommitsUrl(commitsUrl: String) {
        this.commitsUrl = commitsUrl
    }

    fun getReviewCommentsUrl(): String? {
        return reviewCommentsUrl
    }

    fun setReviewCommentsUrl(reviewCommentsUrl: String) {
        this.reviewCommentsUrl = reviewCommentsUrl
    }

    fun getReviewCommentUrl(): String? {
        return reviewCommentUrl
    }

    fun setReviewCommentUrl(reviewCommentUrl: String) {
        this.reviewCommentUrl = reviewCommentUrl
    }

    fun getCommentsUrl(): String? {
        return commentsUrl
    }

    fun setCommentsUrl(commentsUrl: String) {
        this.commentsUrl = commentsUrl
    }

    fun getStatusesUrl(): String? {
        return statusesUrl
    }

    fun setStatusesUrl(statusesUrl: String) {
        this.statusesUrl = statusesUrl
    }

    fun getHead(): Head? {
        return head
    }

    fun setHead(head: Head) {
        this.head = head
    }

    fun getBase(): Base? {
        return base
    }

    fun setBase(base: Base) {
        this.base = base
    }

    fun getLinks(): Links? {
        return links
    }

    fun setLinks(links: Links) {
        this.links = links
    }

    fun getAuthorAssociation(): String? {
        return authorAssociation
    }

    fun setAuthorAssociation(authorAssociation: String) {
        this.authorAssociation = authorAssociation
    }


    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getDocumentationUrl(): String? {
        return documentationUrl
    }

    fun setDocumentationUrl(documentationUrl: String) {
        this.documentationUrl = documentationUrl
    }

    override fun toString(): String {
        return "GithubPullsResponse(message=$message, documentationUrl=$documentationUrl, url=$url, id=$id, nodeId=$nodeId, htmlUrl=$htmlUrl, diffUrl=$diffUrl, patchUrl=$patchUrl, issueUrl=$issueUrl, number=$number, state=$state, locked=$locked, title=$title, user=$user, body=$body, createdAt=$createdAt, updatedAt=$updatedAt, closedAt=$closedAt, mergedAt=$mergedAt, mergeCommitSha=$mergeCommitSha, assignee=$assignee, assignees=$assignees, requestedReviewers=$requestedReviewers, requestedTeams=$requestedTeams, labels=$labels, milestone=$milestone, commitsUrl=$commitsUrl, reviewCommentsUrl=$reviewCommentsUrl, reviewCommentUrl=$reviewCommentUrl, commentsUrl=$commentsUrl, statusesUrl=$statusesUrl, head=$head, base=$base, links=$links, authorAssociation=$authorAssociation)"
    }


}