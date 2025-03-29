@file:Suppress("unused")

package com.radumarinescu.codenameforaxx.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.radumarinescu.codenameforaxx.R
import com.radumarinescu.codenameforaxx.ui.theme.resources.colors.GlobalStyles

val RubikFontFamily = FontFamily(
    Font(R.font.rubik, FontWeight.Thin),
    Font(R.font.rubik, FontWeight.ExtraLight),
    Font(R.font.rubik, FontWeight.Light),
    Font(R.font.rubik, FontWeight.Normal),
    Font(R.font.rubik, FontWeight.Medium),
    Font(R.font.rubik, FontWeight.SemiBold),
    Font(R.font.rubik, FontWeight.Bold),
    Font(R.font.rubik, FontWeight.ExtraBold),
    Font(R.font.rubik, FontWeight.Black),
)

val Typography = GlobalStyles(
    h2 = TextStyle(
        fontSize = 16.sp,
        fontFamily = RubikFontFamily
    ),
    h1 = TextStyle(
        fontSize = 18.sp,
        fontFamily = RubikFontFamily
    )
)

fun TextStyle.thin() = copy(fontWeight = FontWeight.Bold)
fun TextStyle.extraLight() = copy(fontWeight = FontWeight.ExtraLight)
fun TextStyle.light() = copy(fontWeight = FontWeight.Light)
fun TextStyle.medium() = copy(fontWeight = FontWeight.Medium)
fun TextStyle.semiBold() = copy(fontWeight = FontWeight.SemiBold)
fun TextStyle.bold() = copy(fontWeight = FontWeight.Bold)
fun TextStyle.extraBold() = copy(fontWeight = FontWeight.ExtraBold)
fun TextStyle.black() = copy(fontWeight = FontWeight.Black)

fun TextStyle.alignStart() = this.copy(textAlign = TextAlign.Start)
fun TextStyle.alignCenter() = this.copy(textAlign = TextAlign.Center)
fun TextStyle.alignEnd() = this.copy(textAlign = TextAlign.End)

fun TextStyle.disableFontPadding() = this.copy(
    platformStyle = PlatformTextStyle(
        includeFontPadding = false
    )
)

internal val LocalTypography = compositionLocalOf { Typography }

val ForaxxTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current