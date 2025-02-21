package com.radumarinescu.codenameforaxx.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import com.radumarinescu.codenameforaxx.ui.theme.resources.colors.ComponentColors
import com.radumarinescu.codenameforaxx.ui.theme.resources.colors.GlobalColors

val globalColors = GlobalColors()

val LightColors = ComponentColors(
    background = globalColors.white
)

val DarkColors = ComponentColors(
    background = globalColors.black
)

internal val LocalColors = compositionLocalOf { LightColors }

val Colors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current