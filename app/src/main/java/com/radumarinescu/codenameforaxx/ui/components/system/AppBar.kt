package com.radumarinescu.codenameforaxx.ui.components.system

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.radumarinescu.codenameforaxx.R
import com.radumarinescu.codenameforaxx.ui.components.IconButton
import com.radumarinescu.codenameforaxx.ui.components.misc.ForaxxPreview
import com.radumarinescu.codenameforaxx.ui.theme.ForaxxColors
import com.radumarinescu.codenameforaxx.ui.theme.ForaxxTypography

@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    title: String = "",
    navigationButton: @Composable () -> Unit = {},
    actionButton: @Composable () -> Unit = {},
    trailingButton: @Composable () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxWidth()
            .height(56.dp)
            .background(ForaxxColors.background)
            .then(modifier)
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        navigationButton()

        Text(
            modifier = Modifier
                .wrapContentHeight()
                .weight(1f),
            text = title,
            style = ForaxxTypography.h2,
            color = ForaxxColors.textMedium,
            maxLines = 2
        )

        actionButton()
        trailingButton()
    }
}

@Composable
@Preview
private fun AppBarPreview() {
    ForaxxPreview {
        AppBar(
            title = "Details",
            navigationButton = {
                IconButton(
                    painter = painterResource(R.drawable.ic_back)
                )
            },
            actionButton = {
                IconButton(
                    painter = painterResource(R.drawable.ic_upvote_on),
                    tint = Color.Unspecified
                )
            },
            trailingButton = {
                IconButton(
                    painter = painterResource(R.drawable.ic_bookmark)
                )
            }
        )
    }
}