package com.example.ribeirosoaresadvogados

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.ribeirosoaresadvogados.navigation.Route
import com.example.ribeirosoaresadvogados.ui.ContactScreen
import com.example.ribeirosoaresadvogados.ui.HomeScreen
import com.example.ribeirosoaresadvogados.ui.PartnersScreen
import com.example.ribeirosoaresadvogados.ui.theme.RibeiroSoaresTheme

@Composable
fun App() {
    RibeiroSoaresTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // Manual state-based navigation (Navigation 3 concept)
            var currentRoute by remember { mutableStateOf<Route>(Route.Home) }
            
            AnimatedContent(
                targetState = currentRoute,
                label = "MainNavigation"
            ) { route ->
                when (route) {
                    Route.Home -> HomeScreen(
                        onNavigateToPartners = { currentRoute = Route.Partners },
                        onNavigateToContact = { currentRoute = Route.Contact }
                    )
                    Route.Partners -> PartnersScreen(
                        onBack = { currentRoute = Route.Home }
                    )
                    Route.Contact -> ContactScreen(
                        onBack = { currentRoute = Route.Home }
                    )
                }
            }
        }
    }
}
