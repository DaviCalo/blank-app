package com.example.blank_app.di

import com.example.blank_app.repositories.interfaces.IBlankAppApiService
import com.example.blank_app.ui.viewModels.BlankViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { provideCertificateTabViewModel(get()) }
}

fun provideCertificateTabViewModel(iBlankAppApiService: IBlankAppApiService): BlankViewModel {
    return BlankViewModel(iBlankAppApiService)
}