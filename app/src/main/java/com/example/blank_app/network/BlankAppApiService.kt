package com.example.blank_app.network

import com.example.blank_app.model.BlankModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

// MORE INFORMATION RETROFIT: https://square.github.io/retrofit/

interface BlankAppApiService{
    // ADD NEW METHODS HERE

    @GET("YOU PATH")
    suspend fun get(
        @Path("Path") path: String,
        @Header("Authorization") authorization: String,
    ): BlankModel
}