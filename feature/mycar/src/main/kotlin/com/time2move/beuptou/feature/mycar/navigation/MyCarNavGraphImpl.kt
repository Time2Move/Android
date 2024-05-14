package com.time2move.beuptou.feature.mycar.navigation

import androidx.navigation.NavGraphBuilder
import com.time2move.beuptou.feature.mycar.api.MyCarNavGraph
import com.time2move.beuptou.feature.mycar.api.MyCarNavGraphInfo
import javax.inject.Inject

internal class MyCarNavGraphImpl @Inject constructor() : MyCarNavGraph {
    override fun buildNavGraph(navGraphBuilder: NavGraphBuilder, navInfo: MyCarNavGraphInfo) {
        navGraphBuilder
    }
}