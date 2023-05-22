package com.apps.details

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

const val MOVIE_DETAIL_ROUTE = "movie"
const val MOVIE_ID_KEY = "movieId"

fun NavController.navigateToMovie(movieId: Long) {
    this.navigate("${MOVIE_DETAIL_ROUTE}/$movieId")
}

fun NavGraphBuilder.detailScreen(onUpPress: () -> Unit) {
    composable(
        "${MOVIE_DETAIL_ROUTE}/{${MOVIE_ID_KEY}}",
        arguments = listOf(navArgument(MOVIE_ID_KEY) {
            type = NavType.LongType
        })
    ) { navBackStackEntry ->
        val arguments = requireNotNull(navBackStackEntry.arguments)
        val movieId = arguments.getLong(MOVIE_ID_KEY)
        DetailsScreen(movieId = movieId, onUpPress = onUpPress)
    }
}