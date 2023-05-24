package com.apps.core.data.data.repository

import com.apps.core.data.data.datasource.LocalDataSource
import com.apps.core.data.data.datasource.RemoteDataSource
import com.apps.core.data.data.model.MovieEntity

interface MovieRepository {
    fun getMovies(): List<MovieEntity>
}

class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : MovieRepository {

    override fun getMovies(): List<MovieEntity> {
        TODO("Not yet implemented")
    }
}