package com.example.allociney.network.data

import com.google.gson.annotations.SerializedName

class MovieResult (val page: Int,
                   @SerializedName("total_results") val totalResults: Int,
                   @SerializedName("total_pages") val totalPages: Int,
                   val results: Array<MovieData>) {
}