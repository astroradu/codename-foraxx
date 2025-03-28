package com.radumarinescu.codenameforaxx.ui.theme

import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

@Composable
fun ComponentActivity.CodenameForaxxTheme(
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
        enableEdgeToEdge(
            statusBarStyle = getSystemStyle(darkTheme),
            navigationBarStyle = getSystemStyle(darkTheme)
        )
        content()
    }
}

private fun getSystemStyle(darkTheme: Boolean) = if (!darkTheme) {
    SystemBarStyle.light(
        android.graphics.Color.TRANSPARENT,
        android.graphics.Color.TRANSPARENT
    )
} else {
    SystemBarStyle.dark(
        android.graphics.Color.TRANSPARENT
    )
}