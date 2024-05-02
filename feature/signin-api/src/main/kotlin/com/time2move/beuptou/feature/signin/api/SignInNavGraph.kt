package com.time2move.beuptou.feature.signin.api

import com.time2move.beuptou.feature.main.nav.BeUpToUNavGraph

interface SignInNavGraph : BeUpToUNavGraph<SignInNavGraphInfo>

data class SignInNavGraphInfo(
    val onShowErrorSnackbar: (Throwable) -> Unit,
)
