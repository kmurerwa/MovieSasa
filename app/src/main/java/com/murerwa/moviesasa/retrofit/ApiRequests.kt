package com.murerwa.moviesasa.retrofit

import com.murerwa.moviesasa.BuildConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiRequests {
    @GET("/3/movie/popular?api_key=${BuildConfig.API_KEY}&language=en-US&page={page}")
    fun getFeaturedMovies(@Path("page") id: Int): Call<MoviesApiResponse>

    @GET("/3/genre/movie/list?language=en-US&api_key=${BuildConfig.API_KEY}")
    fun getAllGenres(): Call<GenreListResponse>

    @GET("/3/movie/{id}/credits?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getFilmCast(@Path("id") id: String) : Call<CastApiResponse>

}