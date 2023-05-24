package com.apps.core.data.di

import com.apps.core.data.data.datasource.LocalDataSource
import com.apps.core.data.data.datasource.RemoteDataSource
import com.apps.core.data.data.repository.MovieRepository
import com.apps.core.data.data.repository.MovieRepositoryImpl
import com.apps.core.data.data.scope.ScopeProvider
import com.apps.core.data.data.scope.ScopeProviderImpl
import org.koin.core.module.Module
import org.koin.dsl.module


val baseModules: List<Module>
    get() = listOf(commonModule, dataSourceModule, repositoryModule)

val commonModule: Module = module {
    single<ScopeProvider> { ScopeProviderImpl() }
}

val dataSourceModule: Module = module {
    single { LocalDataSource() }
    single { RemoteDataSource(movieApi = get()) }
}

val repositoryModule: Module = module {
    single<MovieRepository> { MovieRepositoryImpl(remoteDataSource = get(), localDataSource = get()) }
}
