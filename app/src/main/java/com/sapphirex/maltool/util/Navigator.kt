package com.sapphirex.maltool.util

import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab


interface Tab : Tab {
//    suspend fun onReselect(navigator: Navigator) {}
}

abstract class Screen : Screen {

//    override val key: ScreenKey = uniqueScreenKey
}