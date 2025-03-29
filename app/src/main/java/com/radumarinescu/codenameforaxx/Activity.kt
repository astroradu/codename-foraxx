package com.radumarinescu.codenameforaxx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.painterResource
import com.radumarinescu.codenameforaxx.ui.components.IconButton
import com.radumarinescu.codenameforaxx.ui.theme.CodenameForaxxTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodenameForaxxTheme {
                IconButton(
                    painter = painterResource(R.drawable.ic_back),
                    onClick = {})
            }
        }
    }
}