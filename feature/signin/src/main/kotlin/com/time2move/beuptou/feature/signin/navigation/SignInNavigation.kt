package com.time2move.beuptou.feature.signin.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

internal fun NavController.navigateSignIn(navOptions: NavOptions) {
    navigate(SignInRoute.ROUTE, navOptions)
}

internal fun NavGraphBuilder.signInNavGraph(
    onShowErrorSnackbar: (Throwable) -> Unit
) {
    composable(route = SignInRoute.ROUTE) {

    }
}
internal object SignInRoute {
    const val ROUTE = "signin"
}
