package com.time2move.beuptou.feature.signin.navigation

import androidx.navigation.NavController
import com.time2move.beuptou.feature.signin.api.SignInNavController
import com.time2move.beuptou.feature.signin.api.SignInNavControllerInfo
import javax.inject.Inject

internal class SignInNavControllerImpl @Inject constructor() : SignInNavController {
    override fun route(): String = SignInRoute.ROUTE

    override fun navigate(navController: NavController, navInfo: SignInNavControllerInfo) {
        navController.navigateSignIn(navInfo.navOptions)
    }
}
