package com.example.by_jetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LearnImage() {
// Image Composable to display an image (5:26)
    Image(
        painter = painterResource(id = R.drawable.pexels_larissafarber), // (5:58) Load image from drawable resources
        contentDescription = "Jetpack Compose Logo" // (6:31) Describe the image for accessibility, can be null (6:40)
    )
}

// You can create a preview for your Composable function to see how it looks
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LearnImage()
    }
}