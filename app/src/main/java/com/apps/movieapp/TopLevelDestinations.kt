package com.apps.movieapp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigation
import com.apps.details.navigateToMovie
import com.apps.home.bottomMenuHomeRoute
import com.apps.home.homeScreen
import com.apps.search.searchScreen

object TopLevelDestinations {
    const val HOME_ROUTE = "home"
}

fun NavGraphBuilder.bottomNestedNavigationGraph(navController: NavHostController) {
    navigation(
        route = TopLevelDestinations.HOME_ROUTE,
        startDestination = bottomMenuHomeRoute,
    ) {
        homeScreen(onMovieClick = { movieId ->
            navController.navigateToMovie(movieId)
        })
        searchScreen(onMovieClick = { movieId ->
            navController.navigateToMovie(movieId)
        })
    }
}