package com.sapphirex.maltool.ui.more

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sapphirex.maltool.util.Screen

object MoreScreen : Screen() {
    @Composable
    override fun Content() {
        Text(text = "More Screen", modifier = Modifier.fillMaxSize())
    }
}