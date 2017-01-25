package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.client;

<<<<<<< Updated upstream:app/src/main/java/com/example/brauliomendez/cleanarquitecturedaggerandgithubapi/retrofit/GithubService.java
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.ApiConstants;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.entity.User;
=======
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity.User;
>>>>>>> Stashed changes:app/src/main/java/com/example/brauliomendez/cleanarquitecturedaggerandgithubapi/client/GithubService.java

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public interface GithubService {

    @POST(GithubClientConstants.USER_ENDPOINT)
    Call<User> getUserInfo(@Field("user_id") String id);

    @GET(GithubClientConstants.SEARCH_REPOSITORIES_ENDPOINT)
    Observable<SearchResponse> getRepositories(@Query("q") String repository);
}

