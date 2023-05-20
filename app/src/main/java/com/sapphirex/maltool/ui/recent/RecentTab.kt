package com.sapphirex.maltool.ui.recent

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.sapphirex.maltool.R
import com.sapphirex.maltool.util.Tab

object RecentTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.recent_tab)
            val icon = rememberVectorPainter(Icons.Default.Add)
            return TabOptions(
                index = 2u,
                title = title,
                icon = icon
            )
        }

    @Composable
    override fun Content() {
        TODO("Not yet implemented")
    }

}