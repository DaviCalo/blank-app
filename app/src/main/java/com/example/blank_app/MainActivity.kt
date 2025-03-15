package com.example.blank_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.blank_app.ui.navigation.BlankNav
import com.example.blank_app.ui.theme.Blank_appTheme

// MORE INFORMATION NAVIGATOR: https://developer.android.com/jetpack/compose/navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Blank_appTheme {
                val navController = rememberNavController()
                BlankNav(navController)
            }
        }
    }
}