package com.time2move.beuptou.feature.mycar.api

import com.time2move.beuptou.feature.main.nav.BeUpToUNavGraph

interface MyCarNavGraph : BeUpToUNavGraph<MyCarNavGraphInfo>

data class MyCarNavGraphInfo(
    val onShowErrorSnackbar: (Throwable) -> Unit,
)