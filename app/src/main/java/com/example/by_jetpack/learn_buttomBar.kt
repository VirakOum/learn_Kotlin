package com.example.by_jetpack
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class BottomNavItem(
    val title: String,
    val icon: ImageVector
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnButtonBar() {

    // Track selected tab
    var selectedIndex by rememberSaveable { mutableIntStateOf(0) }

    // Bottom sheet state
    var showBottomSheet by remember { mutableStateOf(false) }
    val bottomSheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )

    val items = listOf(
        BottomNavItem("Home", Icons.Default.Home),
        BottomNavItem("Search", Icons.Default.Search),
        BottomNavItem("Profile", Icons.Default.Person)
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index
                                  println("Index $index");},
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title
                            )
                        },
                        label = { Text(item.title) }
                    )
                }
            }
        }
    ) { innerPadding ->

        // Screen content
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                when (selectedIndex) {
                    0 -> {
                        Text(
                            "Home Screen",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(
                            onClick = { showBottomSheet = true }
                        ) {
                            Text("Show Bottom Sheet")
                        }
                    }
                    1 -> {
                        Text(
                            "Search Screen",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(
                            onClick = { showBottomSheet = true }
                        ) {
                            Text("Show Search Options")
                        }
                    }
                    2 -> {
                        Text(
                            "Profile Screen",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(
                            onClick = { showBottomSheet = true }
                        ) {
                            Text("Show Profile Options")
                        }
                    }
                }
            }
        }

        // Modal Bottom Sheet
        if (showBottomSheet) {
            ModalBottomSheet(
                onDismissRequest = { showBottomSheet = false },
                sheetState = bottomSheetState,
                dragHandle = { BottomSheetDefaults.DragHandle() }
            ) {
                BottomSheetContent(
                    selectedTab = selectedIndex,
                    onDismiss = { showBottomSheet = false }
                )
            }
        }
    }
}

@Composable
private fun BottomSheetContent(
    selectedTab: Int,
    onDismiss: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (selectedTab) {
            0 -> {
                Text(
                    text = "Home Options",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        println("Home Action 1 clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Home Action 1")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        println("Home Action 2 clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Home Action 2")
                }
            }
            1 -> {
                Text(
                    text = "Search Filters",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        println("Filter by Date clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Filter by Date")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        println("Filter by Category clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Filter by Category")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        println("Advanced Search clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Advanced Search")
                }
            }
            2 -> {
                Text(
                    text = "Profile Settings",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        println("Edit Profile clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Edit Profile")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        println("Change Password clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Change Password")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        println("Logout clicked")
                        onDismiss()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Logout")
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onDismiss,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Close")
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

