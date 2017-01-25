package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.search.domain.entity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BraulioMendez on 1/24/17.
 */

public class SearchResponse {

    @SerializedName("total_count")
    private Integer totalCount;

    @SerializedName("incomplete_results")
    private Boolean incompleteResults;

    private List<Item> items = new ArrayList<>();

    public Integer getTotalCount() {
        return totalCount;
    }

    public Boolean getIncompleteResults() {
        return incompleteResults;
    }

    public List<Item> getItems() {
        return items;
    }
}
