package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.presentation.presenter;

import android.util.Log;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.usecase.GithubSearchRepositoriesUseCase;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.presentation.view.GithubSearchRepositoriesView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

/**
 * Created by Leo on 24/01/17.
 */

public class GithubSearchRepositoriesPresenter {

  private GithubSearchRepositoriesUseCase githubSearchRepositoriesUseCase;
  private GithubSearchRepositoriesView githubSearchRepositoriesView;

  public GithubSearchRepositoriesPresenter(GithubSearchRepositoriesUseCase githubSearchRepositoriesUseCase, GithubSearchRepositoriesView githubSearchRepositoriesView) {
    this.githubSearchRepositoriesUseCase = githubSearchRepositoriesUseCase;
    this.githubSearchRepositoriesView = githubSearchRepositoriesView;
  }

  public void onSearchGithubRepositories(String username){
      githubSearchRepositoriesUseCase.searchGithubRepositories(username)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe(new Observer<SearchResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(SearchResponse value) {
              Log.d("repositories",value.getItems().toString());
              githubSearchRepositoriesView.onShowGithubRepositories(value.getItems());
            }

            @Override
            public void onError(Throwable e) {
              githubSearchRepositoriesView.onShowGithubRepositoriesError(e.getMessage());
              e.printStackTrace();
            }

            @Override
            public void onComplete() {

            }
          });
  }

}
