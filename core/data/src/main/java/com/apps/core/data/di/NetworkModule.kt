package com.apps.core.data.di

import com.apps.core.data.data.api.MovieApi
import com.apps.core.data.data.api.provideKtorClient
import org.koin.core.module.Module
import org.koin.dsl.module


val networkModule: Module = module {
    single { provideKtorClient() }
    single { MovieApi(client = get()) }
}

