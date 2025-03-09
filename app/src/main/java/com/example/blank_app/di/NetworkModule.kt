package com.example.blank_app.di

import android.content.Context
import com.example.blank_app.network.BlackAppApiService
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val NetworkModule = module {
    single { provideUserApi(androidContext()) }
}

fun provideUserApi(context: Context): BlackAppApiService {
    val client = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()

    return Retrofit.Builder()
        .baseUrl("BASE URL HERE")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
        .create(BlackAppApiService::class.java)
}