package com.time2move.beuptou.feature.main.nav

import androidx.navigation.NavGraphBuilder

interface BeUpToUNavGraph<T> {
    fun buildNavGraph(navGraphBuilder: NavGraphBuilder, navInfo: T)
}
