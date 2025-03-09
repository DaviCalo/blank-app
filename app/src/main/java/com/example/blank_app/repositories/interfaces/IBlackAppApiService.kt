package com.irede.homero.repositories.interfaces

import com.example.blank_app.model.BlackModel

interface IBlackAppApiService {
    // ADD NEW METHODS HERE
    suspend fun get(path: Unit, authorization: Unit): BlackModel
}