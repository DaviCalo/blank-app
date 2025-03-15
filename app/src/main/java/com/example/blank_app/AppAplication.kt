package com.example.blank_app

import android.app.Application
import com.example.blank_app.di.NetworkModule
import com.example.blank_app.di.repositoriesModule
import com.example.blank_app.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

// MORE INFORMATION KOIN: https://insert-koin.io/docs/quickstart/kotlin

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(
                viewModelsModule,
                repositoriesModule,
                NetworkModule,
            )
        }
    }
}