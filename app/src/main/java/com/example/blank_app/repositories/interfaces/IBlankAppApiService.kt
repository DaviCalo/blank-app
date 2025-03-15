package com.example.blank_app.repositories.interfaces

import com.example.blank_app.model.BlankModel

interface IBlankAppApiService {
    // ADD NEW METHODS HERE
    suspend fun get(path: String, authorization: String): BlankModel
}