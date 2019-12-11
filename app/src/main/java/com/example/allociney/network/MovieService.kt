package com.example.allociney.network

import com.example.allociney.network.data.MovieResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("3/search/movie?api_key=c1ac741d5dd740f9861e794c5363b0c2")
    fun getMovies (@Query("query") query: String, @Query("page") page: Int = 1): Call<MovieResult>
}