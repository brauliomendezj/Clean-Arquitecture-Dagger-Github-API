package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.domain.usecase;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.domain.repository.GithubFindUserRepository;

import io.reactivex.Observable;

/**
 * Created by BraulioMendez on 1/25/17.
 */

public class GithubFindUsersUseCase {

    private GithubFindUserRepository githubFindUserRepository;

    public GithubFindUsersUseCase(GithubFindUserRepository githubFindUser) {
        this.githubFindUserRepository = githubFindUser;
    }

    public Observable<User> findGithubUser(String user) {
        return githubFindUserRepository.findGithubUsers(user);
    }
}
