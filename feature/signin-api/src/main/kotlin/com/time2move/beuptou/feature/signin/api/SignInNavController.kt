package com.time2move.beuptou.feature.signin.api

import androidx.navigation.NavOptions
import com.time2move.beuptou.feature.main.nav.BeUpToUNavController

interface SignInNavController : BeUpToUNavController<SignInNavControllerInfo>

data class SignInNavControllerInfo(
    val navOptions: NavOptions,
)
