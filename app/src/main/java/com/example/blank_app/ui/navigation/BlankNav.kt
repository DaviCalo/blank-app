package com.example.blank_app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

// MORE INFORMATION NAVIGATOR: https://developer.android.com/jetpack/compose/navigation

@Composable
fun BlankNav(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = AuthGraph) {
        authGraph(
            onNavigateToBlankScreen = {
                navHostController.navigate(BlankScreenRoute)
            },
        )
    }
}