package com.time2move.beuptou.core.designsystem.theme.component.textfield

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.time2move.beuptou.core.designsystem.R
import com.time2move.beuptou.core.designsystem.theme.BeUpToUTheme

@Composable
fun VisibilityTextField(
    visibilityTextFieldState: VisibilityTextFieldState,
    placeholder: (() -> Unit)? = null,
    modifier: Modifier = Modifier,
) {
    val visibility = visibilityTextFieldState.visibility
    val text = visibilityTextFieldState.text

    TextField(
        modifier = modifier
            .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(12.dp)),
        value = text,
        placeholder = placeholder,
        onValueChange = { visibilityTextFieldState.onValueChange(it) },
        shape = RoundedCornerShape(12.dp),
        visualTransformation = if (visibility) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (visibility)
                R.drawable.ic_baseline_visibility_24
            else R.drawable.ic_baseline_visibility_off_24

            IconButton(
                onClick = { visibilityTextFieldState.onVisibilityChange(!visibility) })
            {
                Icon(
                    imageVector = ImageVector.vectorResource(id = image),
                    contentDescription = null
                )
            }
        },
    )
}

@Stable
class VisibilityTextFieldState() {
    var text: String by mutableStateOf("")
        private set
    var visibility: Boolean by mutableStateOf(false)
        private set

    fun onValueChange(value: String) {
        this.text = value
    }

    fun onVisibilityChange(visibility: Boolean) {
        this.visibility = visibility
    }
}

@Composable
fun rememberVisibilityTextFieldState(
    placeholder: @Composable (() -> Unit)? = null,
): VisibilityTextFieldState {
    return remember { VisibilityTextFieldState(placeholder) }
}

@Composable
@Preview
private fun VisibilityTextFieldPreview() {
    BeUpToUTheme {
        val visibilityTextFieldState = rememberVisibilityTextFieldState { Text(text = "비밀번호") }
        VisibilityTextField(visibilityTextFieldState)
    }
}
