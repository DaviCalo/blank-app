package com.example.blank_app.di

import com.example.blank_app.network.BlankAppApiService
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val NetworkModule = module {
    single { provideUserApi() }
}

fun provideUserApi(): BlankAppApiService {
    val client = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()

    return Retrofit.Builder()
        .baseUrl("BASE URL HERE")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
        .create(BlankAppApiService::class.java)
}