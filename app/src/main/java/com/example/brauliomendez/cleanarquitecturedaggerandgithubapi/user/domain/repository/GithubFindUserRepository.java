package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.domain.repository;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;

import io.reactivex.Observable;

/**
 * Created by BraulioMendez on 1/25/17.
 */

public interface GithubFindUserRepository {
    Observable<User> findGithubUsers(String user);
}
