package com.example.allociney.network.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class MovieData(val title: String,
                val adult: Boolean,
                @SerializedName("poster_path") val posterPath: String,
                val overview: String,
                @SerializedName("release_date") val releaseDate: String): Parcelable {
}