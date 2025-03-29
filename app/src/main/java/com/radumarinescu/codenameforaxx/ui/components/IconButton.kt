package com.radumarinescu.codenameforaxx.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.radumarinescu.codenameforaxx.R
import com.radumarinescu.codenameforaxx.ui.components.misc.ForaxxPreview
import com.radumarinescu.codenameforaxx.ui.theme.ForaxxColors

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    painter: Painter,
    tint: Color = ForaxxColors.iconTint,
    enabled: Boolean = true,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .clickable(
                enabled = enabled,
                onClick = onClick,
                indication = ripple(bounded = false),
                interactionSource = remember { MutableInteractionSource() })
            .size(36.dp)
            .then(modifier)
            .padding(8.dp)
            .alpha(if (enabled) 1f else 0.22f),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.fillMaxSize(),
            painter = painter,
            contentDescription = null,
            tint = tint
        )
    }
}

@Composable
@Preview(
    name = "IconButton Enabled",
    group = "IconButton"
)
private fun IconButtonPreview() {
    ForaxxPreview {
        IconButton(
            painter = painterResource(R.drawable.ic_upvote)
        )
    }
}

@Composable
@Preview(
    name = "IconButton Disabled",
    group = "IconButton"
)
private fun IconButtonDisabledPreview() {
    ForaxxPreview {
        IconButton(
            painter = painterResource(R.drawable.ic_upvote),
            enabled = false
        )
    }
}