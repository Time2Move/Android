package com.time2move.beuptou.feature.signin.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.time2move.beuptou.core.designsystem.theme.BeUpToUTheme

@Composable
internal fun SignInUpButtons(
    onClickSignInButton: () -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
    ) {
        Button(
            onClick = { onClickSignInButton() },
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(280 / 50f)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = White,
                contentColor = Black
            )
        ) {
            Text(
                text = "로그인하기",
                style = BeUpToUTheme.typography.bold,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "회원가입",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = BeUpToUTheme.typography.normal,
            fontSize = 14.sp,
        )
    }
}

@Composable
@Preview
private fun SignInUpButtonsPreview() {
    BeUpToUTheme {
        SignInUpButtons {}
    }
}