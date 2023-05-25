package com.apps.core.data.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieEntity(
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String
)
