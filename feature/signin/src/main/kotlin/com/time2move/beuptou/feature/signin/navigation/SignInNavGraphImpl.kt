package com.time2move.beuptou.feature.signin.navigation

import androidx.navigation.NavGraphBuilder
import com.time2move.beuptou.feature.signin.api.SignInNavGraph
import com.time2move.beuptou.feature.signin.api.SignInNavGraphInfo
import javax.inject.Inject

internal class SignInNavGraphImpl @Inject constructor() : SignInNavGraph {
    override fun buildNavGraph(navGraphBuilder: NavGraphBuilder, navInfo: SignInNavGraphInfo) {
        navGraphBuilder.signInNavGraph(navInfo.onShowErrorSnackbar)
    }
}
