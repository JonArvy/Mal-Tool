package com.sapphirex.maltool.ui.mylist

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.sapphirex.maltool.R
import com.sapphirex.maltool.util.Tab

object MyListTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.myList_tab)
            val icon = rememberVectorPainter(Icons.Default.List)
//            val isSelected = LocalTabNavigator.current.current.key == key
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