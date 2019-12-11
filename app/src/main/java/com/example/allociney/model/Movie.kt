package com.example.allociney.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Movie (val title: String, val director: String, val releaseYear: Int): Parcelable {
}