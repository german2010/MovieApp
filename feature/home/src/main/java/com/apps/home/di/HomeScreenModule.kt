package com.apps.home.di

import com.apps.home.HomeScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val homeScreenModule = module {
    viewModel { HomeScreenViewModel(moviesRepository = get()) }
}
