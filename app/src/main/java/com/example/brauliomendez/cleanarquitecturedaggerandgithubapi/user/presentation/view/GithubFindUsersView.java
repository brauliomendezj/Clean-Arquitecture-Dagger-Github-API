package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.presentation.view;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.Item;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;

import java.util.List;

/**
 * Created by BraulioMendez on 1/25/17.
 */

public interface GithubFindUsersView {

    void onShowGithubUsers(User user);

    void onShowGithubUsersError(String message);

    void onHideLoadingProgress();

    void onShowLoadingProgress();

    void onShowEmptyMessage();
}
