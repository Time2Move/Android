package com.time2move.beuptou.feature.mycar.api

import androidx.navigation.NavOptions
import com.time2move.beuptou.feature.main.nav.BeUpToUNavController

interface MyCarNavController : BeUpToUNavController<BeUpToUNavControllerInfo>

data class BeUpToUNavControllerInfo(
    val navOptions: NavOptions,
)