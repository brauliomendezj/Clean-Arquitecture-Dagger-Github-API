package com.example.kotlinversion.domain.usecase

import com.example.kotlinversion.domain.entity.SearchResponse
import com.example.kotlinversion.domain.repository.GithubSearchRepository
import io.reactivex.Observable

/**
 * Created by BraulioMendez on 1/29/17.
 */
class GithubSearchRepositoriesUseCase(var githubSearchRepository: GithubSearchRepository) {

    fun githubSearchRepositories(username : String) : Observable<SearchResponse> {
        return githubSearchRepository.searchGithubRepositories(username)
    }
}