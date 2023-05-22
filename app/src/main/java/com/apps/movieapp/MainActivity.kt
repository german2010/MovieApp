package com.apps.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.apps.details.detailScreen
import com.apps.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    modifier = Modifier,
                    bottomBar = {}
                ) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = TopLevelDestinations.HOME_ROUTE,
                        modifier = Modifier.padding(innerPadding),
                    ) {
                        bottomNestedNavigationGraph(navController)
                        detailScreen(onUpPress = { navController.navigateUp() })
                    }
                }
            }
        }
    }
}