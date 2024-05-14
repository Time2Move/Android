package com.time2move.beuptou.feature.mycar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun MyCarScreen() {
}

@Composable
internal fun RegisterVehicle() {
    // 네모난 카드뷰로 되어 있음
}

@Composable
internal fun MyCarBackground() {
    Row {
        Column {
            Row {
                Text(text = "언카짱")
                Text(text = "님")
            }
            Text(text = "언제 나갈까?")
        }

        Text(text = "프로필사진")
    }

    Text(text = "차량을 등록하고 주차시간을 관리해보세요!")
}

@Composable
internal fun ProfileIcon(
    modifier: Modifier = Modifier,
    imageUrl: String? = null,
) {
    Surface(
        modifier = modifier,
        shape = CircleShape,
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            imageUrl?.let {
                // 이미지 로딩
            } ?: Text(
                modifier = Modifier.align(Alignment.Center),
                text = "프로필사진",
            )
        }
    }
}
