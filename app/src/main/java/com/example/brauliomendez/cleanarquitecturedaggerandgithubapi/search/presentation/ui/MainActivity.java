package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.presentation.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.R;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.data.GithubSearchRepositoryImpl;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client.GithubClient;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client.GithubService;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.Item;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.usecase.GithubSearchRepositoriesUseCase;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.presentation.presenter.GithubSearchRepositoriesPresenter;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.presentation.view.GithubSearchRepositoriesView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GithubSearchRepositoriesView githubSearchRepositoriesView = new GithubSearchRepositoriesView() {
        @Override
        public void onShowGithubRepositories(List<Item> repositories) {
            Log.d("Repositories", repositories.toString());
            Toast.makeText(MainActivity.this,repositories.toString(),Toast.LENGTH_LONG).show();
        }

        @Override
        public void onShowGithubRepositoriesError(String message) {
            Log.d("error",message);
            Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
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
        setContentView(R.layout.activity_main);

        GithubService githubService = GithubClient.getInstance();
        GithubSearchRepositoryImpl githubSearchRepository = new GithubSearchRepositoryImpl(githubService);
        GithubSearchRepositoriesUseCase githubSearchRepositoriesUseCase = new GithubSearchRepositoriesUseCase(githubSearchRepository);
        GithubSearchRepositoriesPresenter githubSearchRepositoriesPresenter =  new GithubSearchRepositoriesPresenter(githubSearchRepositoriesUseCase,githubSearchRepositoriesView);
        githubSearchRepositoriesPresenter.onSearchGithubRepositories("leomindez");
    }



}
