package com.example.blank_app.repositories

import com.example.blank_app.model.BlackModel
import com.example.blank_app.network.BlackAppApiService
import com.irede.homero.repositories.interfaces.IBlackAppApiService

class BlackAppRepository(
    private val blackAppApiService: BlackAppApiService
) : IBlackAppApiService {
    override suspend fun get(path: Unit, authorization: Unit): BlackModel =
        blackAppApiService.get(path, authorization)
}