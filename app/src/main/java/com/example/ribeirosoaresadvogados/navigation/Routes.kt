package com.example.ribeirosoaresadvogados.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface Route {
    @Serializable
    data object Home : Route
    
    @Serializable
    data object Partners : Route
    
    @Serializable
    data object Contact : Route
}
