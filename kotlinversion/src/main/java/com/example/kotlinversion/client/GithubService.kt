package com.example.kotlinversion.client

import com.example.kotlinversion.entity.SearchResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by BraulioMendez on 1/29/17.
 */
interface GithubService {

    @GET(GithubClientConstants.SEARCH_REPOSITORIES_ENDPOINT)
    fun getRepositories(@Query("q") repositories : String) : Observable<SearchResponse>
}