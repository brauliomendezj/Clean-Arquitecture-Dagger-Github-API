package com.example.kotlinversion.domain.entity

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by BraulioMendez on 1/29/17.
 */
data class SearchResponse(@SerializedName("total_count") val totalCount: Int? = null,
                          @SerializedName("incomplete_results") val incompleteResults: Boolean? = null,
                          val items: ArrayList<Item> = ArrayList<Item>()) {

}
