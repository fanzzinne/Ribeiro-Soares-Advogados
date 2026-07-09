package com.example.ribeirosoaresadvogados.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode

@Composable
fun luxuryShimmerBrush(
    targetValue: Float = 1000f,
    showShimmer: Boolean = true
): Brush {
    return if (showShimmer) {
        val shimmerColors = listOf(
            Color(0xFFD4AF37).copy(alpha = 0.6f),
            Color(0xFFF9E29C).copy(alpha = 0.9f),
            Color(0xFFD4AF37).copy(alpha = 0.6f),
        )

        val transition = rememberInfiniteTransition(label = "LuxuryShimmer")
        val translateAnimation by transition.animateFloat(
            initialValue = 0f,
            targetValue = targetValue,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 2000, easing = LinearEasing),
                repeatMode = RepeatMode.Restart
            ),
            label = "ShimmerTranslate"
        )

        Brush.linearGradient(
            colors = shimmerColors,
            start = Offset.Zero,
            end = Offset(x = translateAnimation, y = translateAnimation),
            tileMode = TileMode.Mirror
        )
    } else {
        Brush.linearGradient(
            colors = listOf(Color(0xFFD4AF37), Color(0xFFD4AF37)),
            start = Offset.Zero,
            end = Offset.Zero
        )
    }
}
