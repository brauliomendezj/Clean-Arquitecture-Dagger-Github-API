package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public class Item {

    private Integer id;

    private String name;

    @SerializedName("full_name")
    private String fullName;

    private Owner owner;

    @SerializedName("private")
    private Boolean _private;

    @SerializedName("html_url")
    private String htmlUrl;

    private String description;

    private Boolean fork;

    private String url;

    @SerializedName("forks_url")
    private String forksUrl;

    @SerializedName("keys_url")
    private String keysUrl;

    @SerializedName("collaborators_url")
    private String collaboratorsUrl;

    @SerializedName("teams_url")
    private String teamsUrl;

    @SerializedName("hooks_url")
    private String hooksUrl;

    @SerializedName("issue_events_url")
    private String issueEventsUrl;

    @SerializedName("events_url")
    private String eventsUrl;

    @SerializedName("assignees_url")
    private String assigneesUrl;

    @SerializedName("branches_url")
    private String branchesUrl;

    @SerializedName("tags_url")
    private String tagsUrl;

    @SerializedName("blobs_url")
    private String blobsUrl;

    @SerializedName("git_tags_url")
    private String gitTagsUrl;

    @SerializedName("git_refs_url")
    private String gitRefsUrl;

    @SerializedName("trees_url")
    private String treesUrl;

    @SerializedName("statuses_url")
    private String statusesUrl;

    @SerializedName("languages_url")
    private String languagesUrl;

    @SerializedName("stargazers_url")
    private String stargazersUrl;

    @SerializedName("contributors_url")
    private String contributorsUrl;

    @SerializedName("subscribers_url")
    private String subscribersUrl;

    @SerializedName("subscription_url")
    private String subscriptionUrl;

    @SerializedName("commits_url")
    private String commitsUrl;

    @SerializedName("git_commits_url")
    private String gitCommitsUrl;

    @SerializedName("comments_url")
    private String commentsUrl;

    @SerializedName("issue_comment_url")
    private String issueCommentUrl;

    @SerializedName("contents_url")
    private String contentsUrl;

    @SerializedName("compare_url")
    private String compareUrl;

    @SerializedName("merges_url")
    private String mergesUrl;

    @SerializedName("archive_url")
    private String archiveUrl;

    @SerializedName("downloads_url")
    private String downloadsUrl;

    @SerializedName("issues_url")
    private String issuesUrl;

    @SerializedName("pulls_url")
    private String pullsUrl;

    @SerializedName("milestones_url")
    private String milestonesUrl;

    @SerializedName("notifications_url")
    private String notificationsUrl;

    @SerializedName("labels_url")
    private String labelsUrl;

    @SerializedName("releases_url")
    private String releasesUrl;

    @SerializedName("deployments_url")
    private String deploymentsUrl;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("pushed_at")
    private String pushedAt;

    @SerializedName("git_url")
    private String gitUrl;

    @SerializedName("ssh_url")
    private String sshUrl;

    @SerializedName("clone_url")
    private String cloneUrl;

    @SerializedName("svn_url")
    private String svnUrl;

    private Object homepage;

    private Integer size;

    @SerializedName("stargazers_count")
    private Integer stargazersCount;

    @SerializedName("watchers_count")
    private Integer watchersCount;

    private String language;

    @SerializedName("has_issues")
    private Boolean hasIssues;

    @SerializedName("has_downloads")
    private Boolean hasDownloads;

    @SerializedName("has_wiki")
    private Boolean hasWiki;

    @SerializedName("has_pages")
    private Boolean hasPages;

    @SerializedName("forks_count")
    private Integer forksCount;

    @SerializedName("mirror_url")
    private Object mirrorUrl;

    @SerializedName("open_issues_count")
    private Integer openIssuesCount;

    private Integer forks;

    @SerializedName("open_issues")
    private Integer openIssues;

    private Integer watchers;

    @SerializedName("default_branch")
    private String defaultBranch;

    private Float score;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public Owner getOwner() {
        return owner;
    }

    public Boolean get_private() {
        return _private;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getFork() {
        return fork;
    }

    public String getUrl() {
        return url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public Object getHomepage() {
        return homepage;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public Integer getForks() {
        return forks;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public Float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Item{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", fullName='" + fullName + '\'' +
            ", owner=" + owner +
            ", _private=" + _private +
            ", htmlUrl='" + htmlUrl + '\'' +
            ", description='" + description + '\'' +
            ", fork=" + fork +
            ", url='" + url + '\'' +
            ", forksUrl='" + forksUrl + '\'' +
            ", keysUrl='" + keysUrl + '\'' +
            ", collaboratorsUrl='" + collaboratorsUrl + '\'' +
            ", teamsUrl='" + teamsUrl + '\'' +
            ", hooksUrl='" + hooksUrl + '\'' +
            ", issueEventsUrl='" + issueEventsUrl + '\'' +
            ", eventsUrl='" + eventsUrl + '\'' +
            ", assigneesUrl='" + assigneesUrl + '\'' +
            ", branchesUrl='" + branchesUrl + '\'' +
            ", tagsUrl='" + tagsUrl + '\'' +
            ", blobsUrl='" + blobsUrl + '\'' +
            ", gitTagsUrl='" + gitTagsUrl + '\'' +
            ", gitRefsUrl='" + gitRefsUrl + '\'' +
            ", treesUrl='" + treesUrl + '\'' +
            ", statusesUrl='" + statusesUrl + '\'' +
            ", languagesUrl='" + languagesUrl + '\'' +
            ", stargazersUrl='" + stargazersUrl + '\'' +
            ", contributorsUrl='" + contributorsUrl + '\'' +
            ", subscribersUrl='" + subscribersUrl + '\'' +
            ", subscriptionUrl='" + subscriptionUrl + '\'' +
            ", commitsUrl='" + commitsUrl + '\'' +
            ", gitCommitsUrl='" + gitCommitsUrl + '\'' +
            ", commentsUrl='" + commentsUrl + '\'' +
            ", issueCommentUrl='" + issueCommentUrl + '\'' +
            ", contentsUrl='" + contentsUrl + '\'' +
            ", compareUrl='" + compareUrl + '\'' +
            ", mergesUrl='" + mergesUrl + '\'' +
            ", archiveUrl='" + archiveUrl + '\'' +
            ", downloadsUrl='" + downloadsUrl + '\'' +
            ", issuesUrl='" + issuesUrl + '\'' +
            ", pullsUrl='" + pullsUrl + '\'' +
            ", milestonesUrl='" + milestonesUrl + '\'' +
            ", notificationsUrl='" + notificationsUrl + '\'' +
            ", labelsUrl='" + labelsUrl + '\'' +
            ", releasesUrl='" + releasesUrl + '\'' +
            ", deploymentsUrl='" + deploymentsUrl + '\'' +
            ", createdAt='" + createdAt + '\'' +
            ", updatedAt='" + updatedAt + '\'' +
            ", pushedAt='" + pushedAt + '\'' +
            ", gitUrl='" + gitUrl + '\'' +
            ", sshUrl='" + sshUrl + '\'' +
            ", cloneUrl='" + cloneUrl + '\'' +
            ", svnUrl='" + svnUrl + '\'' +
            ", homepage=" + homepage +
            ", size=" + size +
            ", stargazersCount=" + stargazersCount +
            ", watchersCount=" + watchersCount +
            ", language='" + language + '\'' +
            ", hasIssues=" + hasIssues +
            ", hasDownloads=" + hasDownloads +
            ", hasWiki=" + hasWiki +
            ", hasPages=" + hasPages +
            ", forksCount=" + forksCount +
            ", mirrorUrl=" + mirrorUrl +
            ", openIssuesCount=" + openIssuesCount +
            ", forks=" + forks +
            ", openIssues=" + openIssues +
            ", watchers=" + watchers +
            ", defaultBranch='" + defaultBranch + '\'' +
            ", score=" + score +
            '}';
    }
}