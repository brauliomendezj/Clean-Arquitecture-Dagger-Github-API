package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.usecase;


import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.repository.GithubSearchRepository;

import io.reactivex.Observable;

/**
 * Created by Leo on 24/01/17.
 */

public class GithubSearchRepositoriesUseCase {

  private GithubSearchRepository githubSearchRepository;

  public GithubSearchRepositoriesUseCase(
      GithubSearchRepository githubSearchRepository) {
    this.githubSearchRepository = githubSearchRepository;
  }

  public Observable<SearchResponse> searchGithubRepositories(String username){
    return githubSearchRepository.searchGithubRepositories(username);
  }
}
