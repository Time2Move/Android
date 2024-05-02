package com.time2move.beuptou.feature.main.nav

interface BeUpToUTab {
    val iconResId: Int
    val contentDescriptionResId: Int
    val route: String
    val order: Int
    val isStartDestination: Boolean
}
