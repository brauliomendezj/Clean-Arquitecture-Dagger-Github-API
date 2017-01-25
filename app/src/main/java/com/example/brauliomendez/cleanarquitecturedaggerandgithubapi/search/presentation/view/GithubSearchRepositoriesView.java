package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.presentation.view;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.Item;

import java.util.List;

/**
 * Created by Leo on 24/01/17.
 */

public interface GithubSearchRepositoriesView {
  void onShowGithubRepositories(List<Item> repositories);

  void onShowGithubRepositoriesError(String message);

  void onHideLoadingProgress();

  void onShowLoadingProgress();

  void onShowEmptyMessage();
}
