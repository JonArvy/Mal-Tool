package com.sapphirex.maltool.ui.mylist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sapphirex.maltool.util.Screen

object MyListScreen : Screen() {
    @Composable
    override fun Content() {
        Text(text = "MyList Screen", modifier = Modifier.fillMaxSize())
    }

}