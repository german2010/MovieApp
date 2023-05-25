package com.apps.home

import android.util.Log
import androidx.lifecycle.ViewModel
import com.apps.core.data.data.repository.MovieRepository

class HomeScreenViewModel(private val moviesRepository: MovieRepository) : ViewModel() {
    fun test() {
        Log.d("HomeScreenViewModel","Test")
    }
}