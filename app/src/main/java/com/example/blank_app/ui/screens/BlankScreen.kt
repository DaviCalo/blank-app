package com.example.blank_app.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// MORE INFORMATION COMPOSE: https://developer.android.com/jetpack/compose/documentation
// MORE INFORMATION SCAFFOLD: https://developer.android.com/jetpack/compose/layouts/material3#scaffold
// MORE INFORMATION SURFACE: https://developer.android.com/jetpack/compose/basics

@Composable
fun BlankScreen(
    onNavigateToBlankRoute: () -> Unit,
) {
    Scaffold(
        topBar = {  },
        bottomBar = {  },
        floatingActionButton = {  },
    ) { innerPadding ->
        Surface(
            modifier = Modifier.Companion
                .fillMaxSize()
                .padding(innerPadding),
            color = MaterialTheme.colorScheme.background,
        ) {

        }
    }
}