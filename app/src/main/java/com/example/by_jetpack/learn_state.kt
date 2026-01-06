package com.example.by_jetpack

import android.view.Surface
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LearnState() {
    // This is a placeholder for state management examples in Jetpack Compose.
    // You can implement stateful Composables here using remember, mutableStateOf, etc.
    var age by remember { mutableStateOf(0) }
    Surface(color = Color.LightGray) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Text("Age: $age")

            Button(onClick = { age++ }) {
                Text("Increase Age")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LearnStatePreview() {
    LearnState();
}