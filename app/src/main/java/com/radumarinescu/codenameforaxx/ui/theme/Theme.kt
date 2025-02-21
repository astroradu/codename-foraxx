package com.radumarinescu.codenameforaxx.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

@Composable
fun CodenameForaxxTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    val ripple = RippleConfiguration(
        color = Color.Red,
        rippleAlpha = RippleAlpha(
            draggedAlpha = 0.1f, focusedAlpha = 0.1f, hoveredAlpha = 0.1f, pressedAlpha = 0.1f
        )
    )

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalRippleConfiguration provides ripple
    ) {
        content()
    }
}