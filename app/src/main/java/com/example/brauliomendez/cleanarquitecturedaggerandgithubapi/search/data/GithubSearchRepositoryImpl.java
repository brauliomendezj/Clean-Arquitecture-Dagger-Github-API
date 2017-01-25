package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.data;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client.GithubService;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.repository.GithubSearchRepository;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Leo on 24/01/17.
 */

public class GithubSearchRepositoryImpl implements GithubSearchRepository {

  private GithubService githubService;

  public GithubSearchRepositoryImpl(GithubService githubService) {
    this.githubService = githubService;
  }

  @Override
  public Observable<SearchResponse> searchGithubRepositories(String username) {
    return githubService.getRepositories(username).subscribeOn(Schedulers.newThread());
  }
}
