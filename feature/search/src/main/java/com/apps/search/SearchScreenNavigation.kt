package com.apps.search

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val bottomMenuSearchRoute = "bottom_menu/search"

fun NavGraphBuilder.searchScreen(onMovieClick: (Long) -> Unit) {
    composable(route = bottomMenuSearchRoute) { navBackStackEntry ->
        SearchScreen(onMovieClick)
    }
}