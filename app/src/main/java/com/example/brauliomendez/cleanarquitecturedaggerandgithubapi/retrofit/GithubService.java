package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.retrofit;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public interface GithubService {

    @POST("users/{user_id}")
    Call<User> getUserInfo(@Field("user_id") String id);
}
