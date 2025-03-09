package com.example.blank_app.di

import com.example.blank_app.network.BlackAppApiService
import com.example.blank_app.repositories.BlackAppRepository
import com.irede.homero.repositories.interfaces.IBlackAppApiService
import org.koin.dsl.module

val repositoriesModule = module {
    single { BlackAppRepository(get()) }
    single<IBlackAppApiService> { provideBlackAppRepository(get()) }
}

fun provideBlackAppRepository(blackAppRepository: BlackAppApiService): BlackAppRepository {
    return BlackAppRepository(blackAppRepository)
}