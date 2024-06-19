package com.time2move.beuptou.core.designsystem.theme.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.time2move.beuptou.core.designsystem.R

@Composable
fun SubLogo(modifier: Modifier) {
    Image(
        modifier = modifier,
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_sub_logo),
        contentDescription = "sub logo"
    )
}
