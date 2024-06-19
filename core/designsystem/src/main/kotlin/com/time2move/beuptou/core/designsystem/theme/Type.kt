package com.time2move.beuptou.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.time2move.beuptou.core.designsystem.R
import com.time2move.beuptou.core.designsystem.theme.Typography

private val PretendardFontFamily = FontFamily(
    Font(R.font.pretendard_variable, FontWeight.Normal),
    Font(R.font.pretendard_variable, FontWeight.Bold),
    Font(R.font.pretendard_variable, FontWeight.ExtraBold),
    Font(R.font.pretendard_variable, FontWeight.SemiBold),
    Font(R.font.pretendard_variable, FontWeight.Black),
    Font(R.font.pretendard_variable, FontWeight.Medium),
)

private val PretendardNormalStyle = TextStyle(
    fontFamily = PretendardFontFamily,
    fontWeight = FontWeight.Normal,
)

private val PretendardBoldStyle = TextStyle(
    fontFamily = PretendardFontFamily,
    fontWeight = FontWeight.Bold,
)

private val PretendardExtraBoldStyle = TextStyle(
    fontFamily = PretendardFontFamily,
    fontWeight = FontWeight.ExtraBold,
)

private val PretendardSemiBoldStyle = TextStyle(
    fontFamily = PretendardFontFamily,
    fontWeight = FontWeight.SemiBold,
)

private val PretendardBlackStyle = TextStyle(
    fontFamily = PretendardFontFamily,
    fontWeight = FontWeight.Black,
)

private val PretendardMediumStyle = TextStyle(
    fontFamily = PretendardFontFamily,
    fontWeight = FontWeight.Medium,
)

@Immutable
data class BeUpToUTypography(
    val normal: TextStyle,
    val bold: TextStyle,
    val extraBold: TextStyle,
    val semiBold: TextStyle,
    val black: TextStyle,
    val medium: TextStyle,
)

/**
 * Typography 설정을 위한 객체 생성
 *
 * @property normal 기본 폰트 스타일을 정의하는 PretendardNormalStyle (weight: 400)
 * @property bold 굵은 폰트 스타일을 정의하는 PretendardBoldStyle (weight: 700)
 * @property extraBold 매우 굵은 폰트 스타일을 정의하는 PretendardExtraBoldStyle (weight: 800)
 * @property semiBold 반굵은 폰트 스타일을 정의하는 PretendardSemiBoldStyle (weight: 600)
 * @property black 검정 폰트 스타일을 정의하는 PretendardBlackStyle (weight: 900)
 * @property medium 중간 굵기 폰트 스타일을 정의하는 PretendardMediumStyle (weight: 500)
 */
internal val Typography = BeUpToUTypography(
    normal = PretendardNormalStyle,    // weight: 400
    bold = PretendardBoldStyle,        // weight: 700
    extraBold = PretendardExtraBoldStyle, // weight: 800
    semiBold = PretendardSemiBoldStyle, // weight: 600
    black = PretendardBlackStyle,      // weight: 900
    medium = PretendardMediumStyle     // weight: 500
)

val LocalTypography = staticCompositionLocalOf { Typography }