package com.example.blank_app.network

import com.example.blank_app.model.BlackModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface BlackAppApiService{
    // ADD NEW METHODS HERE

    @GET("YOU PATH")
    suspend fun get(
        @Path("Path") path: Unit,
        @Header("Authorization") authorization: Unit,
    ): BlackModel
}