package com.apps.home

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen (
    onMovieClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    Text(text = "Home Screen", modifier = modifier.clickable(onClick = { onMovieClick(135L) }))
}
