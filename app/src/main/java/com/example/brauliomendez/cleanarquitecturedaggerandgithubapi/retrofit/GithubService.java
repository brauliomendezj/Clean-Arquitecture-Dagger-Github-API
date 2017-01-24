package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.retrofit;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.ApiConstants;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.entity.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public interface GithubService {

    @POST(ApiConstants.USER_ENDPOINT)
    Call<User> getUserInfo(@Field("user_id") String id);

    @POST(ApiConstants.SEARCH_REPOSITORIES_ENDPOINT)
    Call<SearchResponse> getRepositories(@Field("keyword") String keyword);
}

