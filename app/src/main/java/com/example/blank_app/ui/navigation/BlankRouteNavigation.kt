package com.example.blank_app.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.blank_app.ui.screens.BlankScreen
import kotlinx.serialization.Serializable

@Serializable
object BlankScreenRoute

fun NavGraphBuilder.blankRouteNavigation(
    onNavigateToBlankRoute: () -> Unit
) {
    composable<BlankScreenRoute> {
        BlankScreen(
            onNavigateToBlankRoute = onNavigateToBlankRoute
        )
    }
}