package com.austinevick.calculatorui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.austinevick.calculatorui.R
import com.austinevick.calculatorui.components.CalculatorIcon
import com.austinevick.calculatorui.components.CalculatorInputField
import com.austinevick.calculatorui.components.KeyPad
import com.austinevick.calculatorui.components.keyboardValues

@Composable
fun CalculatorScreen() {

    val value = remember { mutableStateOf("") }

    Scaffold(containerColor = Color.Black) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .padding(innerPadding)
        ) {

            CalculatorInputField(
                value = value.value,
                onValueChange = { value.value = it })

            Text(
                "10",
                fontSize = 45.sp,
                color = Color.White.copy(alpha = 0.5f),
                modifier = Modifier.align(Alignment.End).padding(bottom = 16.dp)
            )

            Row(horizontalArrangement = Arrangement.SpaceBetween) {
               CalculatorIcon(icon = R.drawable.history) {}
                CalculatorIcon(icon = R.drawable.ruler) {}
                CalculatorIcon(icon = R.drawable.root) {}
                Spacer(modifier = Modifier.weight(1f))
                CalculatorIcon(icon = R.drawable.backspace) {}
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

            LazyVerticalGrid(
                userScrollEnabled = false,
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),

                columns = GridCells.Fixed(4)) {
                items(keyboardValues.size) {
                    KeyPad(
                       model = keyboardValues[it],
                        onClick = {}
                    )
                }
            }
        }

    }

}