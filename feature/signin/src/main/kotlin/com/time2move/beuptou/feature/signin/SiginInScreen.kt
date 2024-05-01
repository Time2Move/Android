package com.time2move.beuptou.feature.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.time2move.beuptou.core.designsystem.theme.BeUpToUTheme
import com.time2move.beuptou.core.designsystem.theme.LocalBackgroundTheme

@Composable
internal fun SiginInScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LocalBackgroundTheme.current.color),
    ) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Surface(
                shape = CircleShape,
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.CenterHorizontally),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray),
                )
            }

            Text(
                text = "언카에 로그인하여\n주차시간을 관리하세요!",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
            )

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally),
            ) {
                Text(text = "로그인하기")
            }

            Text(text = "회원가입", modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }
}

@Composable
@Preview
private fun SignInScreenPreview() {
    BeUpToUTheme {
        SiginInScreen()
    }
}
