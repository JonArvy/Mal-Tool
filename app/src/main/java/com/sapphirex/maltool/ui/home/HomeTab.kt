package com.sapphirex.maltool.ui.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.sapphirex.maltool.R
import com.sapphirex.maltool.util.Tab

object HomeTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.home_tab)
            val icon = rememberVectorPainter(Icons.Default.Home)
            return TabOptions(
                index = 0u,
                title = title,
                icon = icon
            )
        }


    @Composable
    override fun Content() {

    }

}