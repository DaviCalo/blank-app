package com.example.blank_app.model

import kotlinx.serialization.Serializable

// MORE INFORMATION KOTLINX SERIALIZATION: https://github.com/Kotlin/kotlinx.serialization

@Serializable
data class BlankModel(
    val path: String
)