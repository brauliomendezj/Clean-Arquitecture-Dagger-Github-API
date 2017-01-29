package com.example.kotlinversion.domain.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by BraulioMendez on 1/29/17.
 */
data class Owner(val login: String? = null, val id: Int? = null,
                 @SerializedName("avatar_url") val avatarUrl: String? = null,
                 @SerializedName("gravatar_id") val gravatarId: String? = null,
                 val url: String? = null,
                 @SerializedName("html_url") val htmlUrl: String? = null,
                 @SerializedName("followers_url") val followersUrl: String? = null,
                 @SerializedName("following_url") val followingUrl: String? = null,
                 @SerializedName("gists_url") val gistsUrl: String? = null,
                 @SerializedName("starred_url") val starredUrl: String? = null,
                 @SerializedName("subscriptions_url") val subscriptionsUrl: String? = null,
                 @SerializedName("organizations_url") val organizationsUrl: String? = null,
                 @SerializedName("repos_url") val reposUrl: String? = null,
                 @SerializedName("events_url") val eventsUrl: String? = null,
                 @SerializedName("received_events_url") val receivedEventsUrl: String? = null,
                 val type: String? = null, @SerializedName("site_admin") val siteAdmin: Boolean? = null,
                 val name: String? = null, val company: String? = null, val blog: String? = null,
                 val location: String? = null, val email: String? = null, val hireable: Any? = null,
                 val bio: Any? = null, @SerializedName("public_repos") val publicRepos: Int? = null,
                 @SerializedName("public_gists") val publicGists: Int? = null,
                 val followers: Int? = null, val following: Int? = null,
                 @SerializedName("created_at") val createdAt: String? = null,
                 @SerializedName("updated_at") val updatedAt: String? = null) {

}



