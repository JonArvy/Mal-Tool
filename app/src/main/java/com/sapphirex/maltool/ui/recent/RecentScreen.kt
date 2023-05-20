package com.sapphirex.maltool.ui.recent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sapphirex.maltool.util.Screen

object RecentScreen : Screen() {
    @Composable
    override fun Content() {
        Text(text = "Recent Screen", modifier = Modifier.fillMaxSize())
    }
}