package com.radumarinescu.codenameforaxx.ui.theme.resources.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class ComponentColors(
    var background: Color = Color.Unspecified,

    val gradientUpvoteStart: Color = Color.Unspecified,
    val gradientUpvoteEnd: Color = Color.Unspecified,

    val textStrong: Color = Color.Unspecified,
    val textMedium: Color = Color.Unspecified,
    val textFaded: Color = Color.Unspecified,
    val textUpvote: Color = Color.Unspecified,
    val textQuote: Color = Color.Unspecified
)