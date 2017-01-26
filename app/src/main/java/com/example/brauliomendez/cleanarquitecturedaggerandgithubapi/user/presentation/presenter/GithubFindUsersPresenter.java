package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.presentation.presenter;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.domain.usecase.GithubFindUsersUseCase;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.presentation.view.GithubFindUsersView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

/**
 * Created by BraulioMendez on 1/25/17.
 */

public class GithubFindUsersPresenter {

    private GithubFindUsersUseCase githubFindUsersUseCase;
    private GithubFindUsersView githubFindUsersView;

    public GithubFindUsersPresenter(GithubFindUsersUseCase githubFindUsersUseCase, GithubFindUsersView githubFindUsersView) {
        this.githubFindUsersUseCase = githubFindUsersUseCase;
        this.githubFindUsersView = githubFindUsersView;
    }

    public void onFindGithubUsers(final String user){
        githubFindUsersUseCase.findGithubUser(user)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(User value) {
                        githubFindUsersView.onShowGithubUsers(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        githubFindUsersView.onShowGithubUsersError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
