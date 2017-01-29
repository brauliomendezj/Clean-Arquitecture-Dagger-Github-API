package com.example.kotlinversion.domain.repository

import com.example.kotlinversion.domain.entity.SearchResponse
import io.reactivex.Observable

/**
 * Created by BraulioMendez on 1/29/17.
 */
interface GithubSearchRepository {

    fun searchGithubRepositories(username : String) : Observable<SearchResponse>
}