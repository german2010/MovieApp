package com.apps.details

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DetailsScreen(
    movieId: Long,
    onUpPress: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(text = "Detailed Screen with id: $movieId", modifier = modifier.clickable(onClick = onUpPress))
}
