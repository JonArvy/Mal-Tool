package com.sapphirex.maltool.ui.seasonal

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sapphirex.maltool.util.Screen

object SeasonalScreen : Screen() {
    @Composable
    override fun Content() {
        Text(text = "Seasonal Screen", modifier = Modifier.fillMaxSize())
    }
}