package com.austinevick.calculatorui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun KeyPad(model: KeyboardModel,onClick: () -> Unit) {

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor =model. backgroundColor,
            contentColor =model. textColor
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
          model. label,
            fontSize = 26.sp,
            modifier = Modifier
                .padding(
                    vertical = 16.dp,
                    horizontal = 4.dp
                ),
        )
    }
}

val Red = Color(0xffFF5959)
val Green = Color(0xff66FF7F)
val BGWhite =Color(0xffF0F0F0)
val BGBlack = Color(0xff343434)
val textColorBlack = Color(0xff4E4D4D)


val keyboardValues = listOf(
    KeyboardModel("C", Color.White, Red),
    KeyboardModel("()", Green, BGBlack),
    KeyboardModel("%", Green, BGBlack),
    KeyboardModel("÷", Green, BGBlack),
    KeyboardModel("7", BGWhite, BGBlack),
    KeyboardModel("8", BGWhite, BGBlack),
    KeyboardModel("9", BGWhite, BGBlack),
    KeyboardModel("×", Green, BGBlack),
    KeyboardModel("4", BGWhite, BGBlack),
    KeyboardModel("5", BGWhite, BGBlack),
    KeyboardModel("6", BGWhite, BGBlack),
    KeyboardModel("-", Green, BGBlack),
    KeyboardModel("1", BGWhite, BGBlack),
    KeyboardModel("2", BGWhite, BGBlack),
    KeyboardModel("3", BGWhite, BGBlack),
    KeyboardModel("+", Green, BGBlack),
    KeyboardModel("M", BGWhite, BGBlack),
    KeyboardModel("0", BGWhite, BGBlack),
    KeyboardModel("•", BGWhite, BGBlack),
    KeyboardModel("=", Color.Black, Green))


data class KeyboardModel(
    val label: String,
    val textColor: Color,
    val backgroundColor: Color
)