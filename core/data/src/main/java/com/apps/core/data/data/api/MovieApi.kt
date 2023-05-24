package com.apps.core.data.data.api

import com.apps.core.BuildConfig
import com.apps.core.data.data.model.MovieEntity
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class MovieApi(private val client: HttpClient) {
    private val baseUrl = BuildConfig.BASE_URL

    suspend fun getMovies(): MovieEntity = client.get("$baseUrl/movies").body()
}