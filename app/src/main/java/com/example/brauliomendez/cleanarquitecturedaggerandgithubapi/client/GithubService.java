package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client;

import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.SearchResponse;
<<<<<<< HEAD
=======
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.Owner;
>>>>>>> 39a09c2... NEW: Added User Package.
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
<<<<<<< HEAD
=======
import retrofit2.http.Path;
>>>>>>> 39a09c2... NEW: Added User Package.
import retrofit2.http.Query;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public interface GithubService {

<<<<<<< HEAD
    @POST(GithubClientConstants.USER_ENDPOINT)
    Call<User> getUserInfo(@Field("user_id") String id);
=======
    @GET(GithubClientConstants.USER_ENDPOINT)
    Observable<User> getUserInfo(@Path("user_id") String id);
>>>>>>> 39a09c2... NEW: Added User Package.

    @GET(GithubClientConstants.SEARCH_REPOSITORIES_ENDPOINT)
    Observable<SearchResponse> getRepositories(@Query("q") String repository);
}

