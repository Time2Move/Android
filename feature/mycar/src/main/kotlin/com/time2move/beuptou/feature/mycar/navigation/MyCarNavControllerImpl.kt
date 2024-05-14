package com.time2move.beuptou.feature.mycar.navigation

import androidx.navigation.NavController
import com.time2move.beuptou.feature.mycar.api.BeUpToUNavControllerInfo
import com.time2move.beuptou.feature.mycar.api.MyCarNavController
import javax.inject.Inject

internal class MyCarNavControllerImpl @Inject constructor() : MyCarNavController {
    override fun route(): String = MyCarRoute.ROUTE

    override fun navigate(navController: NavController, navInfo: BeUpToUNavControllerInfo) {
        TODO("Not yet implemented")
    }
}
