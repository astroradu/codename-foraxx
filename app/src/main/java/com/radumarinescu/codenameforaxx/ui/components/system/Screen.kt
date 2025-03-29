package com.radumarinescu.codenameforaxx.ui.components.system

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.radumarinescu.codenameforaxx.R
import com.radumarinescu.codenameforaxx.ui.components.IconButton
import com.radumarinescu.codenameforaxx.ui.components.misc.ForaxxPreview
import com.radumarinescu.codenameforaxx.ui.theme.ForaxxColors
import kotlinx.coroutines.launch

@Composable
fun Screen(
    sheetVisible: Boolean = false,
    sheet: @Composable ColumnScope.() -> Unit = {},
    appBar: @Composable () -> Unit = {},
    content: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    onSheetDismiss: () -> Unit = {}
) {
    Scaffold(
        containerColor = ForaxxColors.background,
        topBar = appBar,
        bottomBar = bottomBar,
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                content()
            }

            ModalSheetManager(
                visible = sheetVisible,
                sheetContent = sheet,
                onDismiss = onSheetDismiss
            )
        }
    )
}

@Composable
private fun ModalSheetManager(
    visible: Boolean = false,
    sheetContent: @Composable ColumnScope.() -> Unit = {},
    onDismiss: () -> Unit = {}
) {
    val state = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val scope = rememberCoroutineScope()

    if (visible) {
        ModalBottomSheet(
            onDismissRequest = {
                scope.launch {
                    state.hide()
                }.invokeOnCompletion {
                    if (!state.isVisible) {
                        onDismiss()
                    }
                }
            },
            sheetState = state,
            scrimColor = ForaxxColors.background.copy(alpha = 0.3f),
            containerColor = ForaxxColors.gradientUpvoteStart,
            content = sheetContent,
            dragHandle = {}
        )
    }
}

@Composable
@Preview
private fun ScreenPreview() {
    ForaxxPreview {
        var visible by remember { mutableStateOf(false) }
        Screen(
            appBar = {
                AppBar(
                    navigationButton = {
                        IconButton(
                            painter = painterResource(R.drawable.ic_back),
                            onClick = {
                                visible = !visible
                            })
                    }
                )
            },
            sheet = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(ForaxxColors.gradientUpvoteStart)
                )
            },
            sheetVisible = visible,
            onSheetDismiss = { visible = false }
        )
    }
}
