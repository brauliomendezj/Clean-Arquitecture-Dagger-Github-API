package com.example.kotlinversion.domain.data

import com.example.kotlinversion.client.GithubService
import com.example.kotlinversion.domain.entity.SearchResponse
import com.example.kotlinversion.domain.repository.GithubSearchRepository
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

/**
 * Created by BraulioMendez on 1/29/17.
 */
class GithubSearchRepositoryImp(var githubService: GithubService) : GithubSearchRepository{

    override fun searchGithubRepositories(username: String): Observable<SearchResponse> {
        return githubService.getRepositories(username).subscribeOn(Schedulers.newThread())
    }
}