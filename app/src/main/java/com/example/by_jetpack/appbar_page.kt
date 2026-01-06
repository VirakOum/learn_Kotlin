package com.example.by_jetpack

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarLearningPage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("AppBar Learning") },
                navigationIcon = {
                    IconButton(onClick = { /* TODO: open drawer */ }) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { /* TODO: favorite */ }) {
                        Icon(Icons.Default.Favorite, contentDescription = "Favorite")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar {
                Text(
                    "Bottom App Bar",
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* TODO: add */ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState(0))
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(text = "This page demonstrates a TopAppBar, BottomAppBar and a FAB.")
                Button(onClick = { /* sample action */ }) {
                    Text("Primary action")
                }
                Text(text = "This page demonstrates a TopAppBar, BottomAppBar and a FAB.")
                Button(onClick = { /* sample action */ }) {
                    Text("Primary action")
                }
                Text(text = "This page demonstrates a TopAppBar, BottomAppBar and a FAB.")
                Button(onClick = { /* sample action */ }) {
                    Text("Primary action")
                }


            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AppBarLearningPagePreview() {
    AppBarLearningPage()
}