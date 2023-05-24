package com.apps.movieapp

import android.app.Application
import com.apps.movieapp.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber
import timber.log.Timber.Forest.plant


class App : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(appModules)
        }

        if (BuildConfig.DEBUG) {
            plant(Timber.DebugTree())
        }/* else {
            plant(CrashReportingTree())
        }*/
    }
}