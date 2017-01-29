package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public interface GithubService {

    @GET(GithubClientConstants.USER_ENDPOINT)
    Observable<User> getUserInfo(@Path("user_id") String id);

    @GET(GithubClientConstants.SEARCH_REPOSITORIES_ENDPOINT)
    Observable<SearchResponse> getRepositories(@Query("q") String repository);
}

