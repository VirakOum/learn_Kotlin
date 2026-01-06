package com.example.by_jetpack

import android.widget.Button
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun LearnButton() {
    val context = LocalContext.current.applicationContext // (2:00)

    Column( // (1:27)
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center, // (4:39)
        horizontalAlignment = Alignment.CenterHorizontally // (4:46)
    ) {
        Button(
            onClick = { // (1:40)
                Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show() // (2:23)
            },
            shape = RoundedCornerShape(16.dp), // (3:28)
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red) // (3:53)
        ) {
            Text(text = "Login") // (4:21)
        }
    }
}