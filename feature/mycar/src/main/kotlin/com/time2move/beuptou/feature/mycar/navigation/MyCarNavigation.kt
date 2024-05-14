package com.time2move.beuptou.feature.mycar.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

internal fun NavController.navigateMyCar(navOptions: NavOptions) {
    navigate(MyCarRoute.ROUTE, navOptions)
}

internal fun NavGraphBuilder.myCarNavGraph(
    onShowErrorSnackbar: (Throwable) -> Unit,
) {
    composable(route = MyCarRoute.ROUTE) {
    }
}

internal object MyCarRoute {
    const val ROUTE = "mycar"
}
