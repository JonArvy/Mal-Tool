package com.sapphirex.maltool.util

import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey

abstract class Screen : Screen {

    override val key: ScreenKey = uniqueScreenKey
}