package com.time2move.beuptou.feature.main.nav

import androidx.navigation.NavController

interface BeUpToUNavController<T> {
    fun route(): String = ""
    fun navigate(navController: NavController, navInfo: T)
}