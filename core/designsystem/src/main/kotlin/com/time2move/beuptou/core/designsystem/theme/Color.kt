package com.time2move.beuptou.core.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class BeUpToUColorScheme(
    val mainBlue: Color,
    val error: Color,
)

internal val ColorScheme = BeUpToUColorScheme(
    mainBlue = Color(0xFF00A1FF),
    error = Color(0xFFFF8676),
)

val LocalColorScheme = staticCompositionLocalOf { ColorScheme }