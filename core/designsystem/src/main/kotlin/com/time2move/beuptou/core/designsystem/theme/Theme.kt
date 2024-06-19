package com.time2move.beuptou.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val LightDefaultColorScheme = lightColorScheme(
    surface = Color.White,
)

@Composable
fun BeUpToUTheme(
    content: @Composable () -> Unit,
) {
    val defaultBackgroundTheme = BackgroundTheme(
        color = colorScheme.surface,
        tonalElevation = 2.dp,
    )
    val colorScheme = LightDefaultColorScheme
    CompositionLocalProvider(
        LocalBackgroundTheme provides defaultBackgroundTheme,
        LocalTypography provides Typography,
        LocalColorScheme provides ColorScheme,
    ) {
        MaterialTheme(
            content = content,
        )
    }
}

object BeUpToUTheme {
    /**
     * @property normal 기본 폰트 스타일을 정의 (weight: 400)
     * @property bold 굵은 폰트 스타일을 정의 (weight: 700)
     * @property extraBold 매우 굵은 폰트 스타일을 정의 (weight: 800)
     * @property semiBold 반굵은 폰트 스타일을 정의 (weight: 600)
     * @property black 검정 폰트 스타일을 정의 (weight: 900)
     * @property medium 중간 굵기 폰트 스타일을 정의 (weight: 500)
     */
    val typography: BeUpToUTypography
        @Composable
        get() = LocalTypography.current

    val colorScheme: BeUpToUColorScheme
        @Composable
        get() = LocalColorScheme.current
}