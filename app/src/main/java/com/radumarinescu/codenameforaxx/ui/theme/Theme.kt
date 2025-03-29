package com.radumarinescu.codenameforaxx.ui.theme

import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
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
        color = colors.ripple,
        rippleAlpha = RippleAlpha(
            draggedAlpha = 1f, focusedAlpha = 1f, hoveredAlpha = 1f, pressedAlpha = 1f
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

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(ForaxxColors.background)
                .systemBarsPadding()
        ) {
            content()
        }
    }
}

@Composable
fun CodenameForaxxThemePreview(
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
        LocalTypography provides Typography,
        LocalRippleConfiguration provides ripple
    ) {
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