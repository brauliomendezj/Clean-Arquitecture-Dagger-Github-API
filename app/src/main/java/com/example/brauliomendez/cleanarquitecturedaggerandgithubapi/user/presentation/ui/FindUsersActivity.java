package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.presentation.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.R;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client.GithubClient;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client.GithubService;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.data.GithubFindUsersRepositoryImpl;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.domain.usecase.GithubFindUsersUseCase;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.presentation.presenter.GithubFindUsersPresenter;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.user.presentation.view.GithubFindUsersView;

public class FindUsersActivity extends AppCompatActivity {

    private GithubFindUsersView githubFindUsersView = new GithubFindUsersView() {
        @Override
        public void onShowGithubUsers(User user) {
            Toast.makeText(FindUsersActivity.this, user.toString(), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onShowGithubUsersError(String message) {
            Toast.makeText(FindUsersActivity.this, message, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onHideLoadingProgress() {

        }

        @Override
        public void onShowLoadingProgress() {

        }

        @Override
        public void onShowEmptyMessage() {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_users);

        GithubService githubService = GithubClient.getInstance();
        GithubFindUsersRepositoryImpl githubFindUsersRepository = new GithubFindUsersRepositoryImpl(githubService);
        GithubFindUsersUseCase githubFindUsersUseCase = new GithubFindUsersUseCase(githubFindUsersRepository);
        GithubFindUsersPresenter githubFindUsersPresenter = new GithubFindUsersPresenter(githubFindUsersUseCase, githubFindUsersView);
        githubFindUsersPresenter.onFindGithubUsers("brauliomendez");
    }
}
