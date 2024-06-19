package com.time2move.beuptou.feature.signin

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.time2move.beuptou.core.designsystem.theme.BeUpToUTheme
import com.time2move.beuptou.core.designsystem.theme.LocalColorScheme
import com.time2move.beuptou.core.designsystem.theme.component.MainLogo
import com.time2move.beuptou.feature.signin.component.SignInUpButtons

@Composable
internal fun SignInScreen(
    isSignInButtonClicked: Boolean = false,
    onClickSignInButton: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LocalColorScheme.current.mainBlue),
    ) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            MainLogo(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 12.dp)
                    .size(100.dp)
            )

            Text(
                text = "비엇슈에 로그인하여\n주차시간을 관리하세요!",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 40.dp),
                textAlign = TextAlign.Center,
                style = BeUpToUTheme.typography.bold,
                fontSize = 18.sp,
            )

            Spacer(modifier = Modifier.height(86.dp))
            AnimatedVisibility(visible = isSignInButtonClicked.not()) {
                SignInUpButtons { onClickSignInButton() }
            }
            AnimatedVisibility(visible = isSignInButtonClicked) {
                Spacer(modifier = Modifier.height(50.dp))
                InputTextFields()
            }
        }
    }
}

@Composable
internal fun InputTextFields() {
    var id by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(12.dp)),
            value = id,
            onValueChange = { id = it },
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
        )
        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(12.dp)),
            value = password,
            onValueChange = { password = it },
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            visualTransformation = PasswordVisualTransformation(),
        )
    }
}

@Composable
@Preview
private fun SignInScreenPreview() {
    var signInButtonClicked by remember { mutableStateOf(false) }
    BeUpToUTheme {
        SignInScreen(
            isSignInButtonClicked = signInButtonClicked,
            onClickSignInButton = { signInButtonClicked = signInButtonClicked.not() },
        )
    }
}

@Composable
@Preview
private fun SignInScreenPreview2() {
    var signInButtonClicked by remember { mutableStateOf(true) }
    BeUpToUTheme {
        SignInScreen(
            isSignInButtonClicked = signInButtonClicked,
            onClickSignInButton = { signInButtonClicked = signInButtonClicked.not() },
        )
    }
}
