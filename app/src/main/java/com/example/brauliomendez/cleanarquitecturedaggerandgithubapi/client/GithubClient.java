package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client;


import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
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
                    .baseUrl(GithubClientConstants.BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(createInterceptorClient())
                    .build();
            API_SERVICE = retrofit.create(GithubService.class);
        }
        return API_SERVICE;
    }

    private static OkHttpClient createInterceptorClient(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);
        return builder.build();
    }
}
