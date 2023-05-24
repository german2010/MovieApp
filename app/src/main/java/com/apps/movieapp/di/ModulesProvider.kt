package com.apps.movieapp.di

import com.apps.core.data.di.baseModules
import com.apps.core.data.di.networkModule
import com.apps.home.di.homeScreenModule
import org.koin.core.module.Module

val appModules: List<Module>
    get() {
        return ArrayList<Module>().apply {
            addAll(baseModules)
            add(networkModule)
            add(homeScreenModule)
        }
    }