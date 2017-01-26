package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.data;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client.GithubService;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.domain.repository.GithubFindUserRepository;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by BraulioMendez on 1/25/17.
 */

public class GithubFindUsersRepositoryImpl implements GithubFindUserRepository {

    private GithubService githubService;

    public GithubFindUsersRepositoryImpl(GithubService githubService) {
        this.githubService = githubService;
    }

    @Override
    public Observable<User> findGithubUsers(String user) {
        return githubService.getUserInfo(user).subscribeOn(Schedulers.newThread());
    }
}
