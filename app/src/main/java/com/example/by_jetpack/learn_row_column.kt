package com.example.by_jetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.contracts.contract

@Composable
fun LearnRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        Text("Hello");
        Text("World");
    }
}
@Composable
fun LearnColumn() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Text("Hello");
        Text("World");
    }
}
@Composable
fun LearnBox() {
    Surface(color = Color.LightGray) {

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)){
            Box(contentAlignment = Alignment.Center) {
                Text("Hello World")

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LearnRowPreview() {
    LearnRow()
}
@Preview(showBackground = true)
@Composable
fun LearnColumnPreview() {
    LearnColumn()
}