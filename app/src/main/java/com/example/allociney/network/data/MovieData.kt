package com.example.allociney.network.data

import com.google.gson.annotations.SerializedName

class MovieData(val title: String,
                val adult: Boolean,
                @SerializedName("poster_path") val posterPath: String,
                val overview: String,
                @SerializedName("release_date") val releaseDate: String) {
}