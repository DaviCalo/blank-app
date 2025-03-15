package com.example.blank_app.di

import com.example.blank_app.network.BlankAppApiService
import com.example.blank_app.repositories.BlankAppRepository
import com.example.blank_app.repositories.interfaces.IBlankAppApiService
import org.koin.dsl.module

val repositoriesModule = module {
    single { BlankAppRepository(get()) }
    single<IBlankAppApiService> { provideBlackAppRepository(get()) }
}

fun provideBlackAppRepository(blackAppRepository: BlankAppApiService): BlankAppRepository {
    return BlankAppRepository(blackAppRepository)
}