package com.radumarinescu.codenameforaxx.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import com.radumarinescu.codenameforaxx.ui.theme.resources.colors.ComponentColors
import com.radumarinescu.codenameforaxx.ui.theme.resources.colors.GlobalColors

val globalColors = GlobalColors()

val LightColors = ComponentColors(
    background = globalColors.white,
    gradientUpvoteStart = globalColors.lightRed,
    gradientUpvoteEnd = globalColors.sunshade,
    textStrong = globalColors.gainsboro,
    textMedium = globalColors.silver,
    textFaded = globalColors.mistBlue,
    textUpvote = globalColors.mediumVermilion,
    textQuote = globalColors.jungleGreen,
    iconTint = globalColors.silver,
    ripple = globalColors.darkJungleGreen
)

val DarkColors = ComponentColors(
    background = globalColors.anthracite,
    gradientUpvoteStart = globalColors.lightRed,
    gradientUpvoteEnd = globalColors.sunshade,
    textStrong = globalColors.gainsboro,
    textMedium = globalColors.silver,
    textFaded = globalColors.mistBlue,
    textUpvote = globalColors.mediumVermilion,
    textQuote = globalColors.jungleGreen,
    iconTint = globalColors.silver,
    ripple = globalColors.darkJungleGreen
)

internal val LocalColors = compositionLocalOf { DarkColors }

val ForaxxColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current