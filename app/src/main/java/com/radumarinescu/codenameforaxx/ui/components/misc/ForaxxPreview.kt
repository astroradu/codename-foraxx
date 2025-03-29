package com.radumarinescu.codenameforaxx.ui.components.misc

import androidx.compose.runtime.Composable
import com.radumarinescu.codenameforaxx.ui.theme.CodenameForaxxThemePreview

@Composable
fun ForaxxPreview(
    content: @Composable () -> Unit
) {
    CodenameForaxxThemePreview(true) {
        content()
    }
}
