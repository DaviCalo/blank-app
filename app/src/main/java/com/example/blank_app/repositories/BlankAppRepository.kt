package com.example.blank_app.repositories

import com.example.blank_app.model.BlankModel
import com.example.blank_app.network.BlankAppApiService
import com.example.blank_app.repositories.interfaces.IBlankAppApiService

// MORE INFORMATION REPOSITORY: https://developer.android.com/jetpack/guide/data-layer

class BlankAppRepository(
    private val blankAppApiService: BlankAppApiService
): IBlankAppApiService {
    override suspend fun get(
        path: String,
        authorization: String
    ): BlankModel {
        return blankAppApiService.get(path, authorization)
    }
}