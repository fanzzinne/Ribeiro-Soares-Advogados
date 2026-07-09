package com.example.ribeirosoaresadvogados.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = DouradoEscovado,
    onPrimary = Color.Black,
    primaryContainer = DouradoEscuro,
    onPrimaryContainer = DouradoClaro,
    secondary = DouradoEscuro,
    onSecondary = Color.White,
    background = PretoProfundo,
    surface = SuperficieEscura,
    onBackground = Color.White,
    onSurface = OnSuperficieEscura,
    outline = DouradoEscovado
)

private val LightColorScheme = lightColorScheme(
    primary = DouradoEscuro,
    onPrimary = Color.White,
    primaryContainer = DouradoClaro,
    onPrimaryContainer = Color.Black,
    secondary = DouradoEscovado,
    onSecondary = Color.Black,
    background = Color.White,
    surface = Color(0xFFF5F5F5),
    onBackground = Color.Black,
    onSurface = Color.Black,
    outline = DouradoEscuro
)

@Composable
fun RibeiroSoaresTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    // Simplified theme for KMP (dropping dynamic colors for now for Wasm compatibility)
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
