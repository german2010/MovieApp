package com.apps.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val bottomMenuHomeRoute = "bottom_menu/home"

fun NavGraphBuilder.homeScreen(onMovieClick: (Long) -> Unit) {
    composable(route = bottomMenuHomeRoute) { navBackStackEntry ->
        HomeScreen(onMovieClick)
    }
}