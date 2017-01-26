package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public class Owner {

    private String login;

    private Integer id;

    @SerializedName("avatar_url")
    private String avatarUrl;

    @SerializedName("gravatar_id")
    private String gravatarId;

    private String url;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("followers_url")
    private String followersUrl;

    @SerializedName("following_url")
    private String followingUrl;

    @SerializedName("gists_url")
    private String gistsUrl;

    @SerializedName("starred_url")
    private String starredUrl;

    @SerializedName("subscriptions_url")
    private String subscriptionsUrl;

    @SerializedName("organizations_url")
    private String organizationsUrl;

    @SerializedName("repos_url")
    private String reposUrl;

    @SerializedName("events_url")
    private String eventsUrl;

    @SerializedName("received_events_url")
    private String receivedEventsUrl;

    private String type;

    @SerializedName("site_admin")
    private Boolean siteAdmin;

    private String name;

    private String company;

    private String blog;

    private String location;

    private String email;

    private Object hireable;

    private Object bio;

    @SerializedName("public_repos")
    private Integer publicRepos;

    @SerializedName("public_gists")
    private Integer publicGists;

    private Integer followers;

    private Integer following;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    public String getLogin() {
        return login;
    }

    public Integer getId() {
        return id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public Object getHireable() {
        return hireable;
    }

    public Object getBio() {
        return bio;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}



