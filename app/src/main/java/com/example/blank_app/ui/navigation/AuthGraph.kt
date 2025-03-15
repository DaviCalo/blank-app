package com.example.blank_app.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import kotlinx.serialization.Serializable

@Serializable
object AuthGraph

fun NavGraphBuilder.authGraph(
    onNavigateToBlankScreen: () -> Unit
) {
    navigation<AuthGraph>(
        startDestination = BlankScreenRoute
    ) {
        blankRouteNavigation(
            onNavigateToBlankRoute = onNavigateToBlankScreen
        )
    }
}