package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public class GithubClient {

    public static GithubService API_SERVICE;

    public static GithubService getInstance() {
        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            API_SERVICE = retrofit.create(GithubService.class);
        }
        return API_SERVICE;
    }
}
