package com.radumarinescu.codenameforaxx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.radumarinescu.codenameforaxx.ui.Navigation
import com.radumarinescu.codenameforaxx.ui.theme.CodenameForaxxTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodenameForaxxTheme {
                val navController = rememberNavController()
                Navigation(navController)
            }
        }
    }
}