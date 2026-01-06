# Navigation Drawer Learning with Jetpack Compose

This project contains comprehensive examples for learning Navigation Drawer implementation in Jetpack Compose.

## 📁 Files Overview

### 1. `NavigationDrawerTutorial.kt`
**Purpose:** Step-by-step tutorial for beginners

**Contains:**
- `BasicNavigationDrawer()` - Minimal implementation
- `NavigationDrawerWithIcons()` - Adding icons and selection state
- `CompleteNavigationDrawer()` - Full-featured drawer with header and sections
- `NavigationDrawerTutorial()` - Interactive tutorial component

### 2. `NavigationDrawerExample.kt`
**Purpose:** Complete, production-ready implementation

**Features:**
- Custom drawer header with user info
- Badge support for notifications
- Multiple screen examples
- Responsive design
- Professional UI/UX patterns

### 3. `DrawerTypesDemo.kt`
**Purpose:** Learn different types of navigation drawers

**Drawer Types:**
- **Modal Drawer** - Overlays content, can be dismissed
- **Persistent Drawer** - Toggleable, stays alongside content
- **Permanent Drawer** - Always visible, typically for larger screens

## 🚀 Getting Started

### Method 1: Interactive Learning (Recommended)
```kotlin
// In MainActivity.kt, use:
NavigationDrawerLearningScreen()
```
This shows all three drawer types with explanations and interactive examples.

### Method 2: Step-by-Step Tutorial
```kotlin
// In MainActivity.kt, use:
NavigationDrawerTutorial()
```
Perfect for beginners to understand the implementation progressively.

### Method 3: Complete Example
```kotlin
// In MainActivity.kt, use:
NavigationDrawerExample()
```
Shows a fully-featured navigation drawer with all best practices.

## 📖 Learning Path

### Beginner Level
1. Start with `BasicNavigationDrawer()` in `NavigationDrawerTutorial.kt`
2. Understand basic drawer state management
3. Learn how to open/close the drawer

### Intermediate Level
1. Study `NavigationDrawerWithIcons()`
2. Learn about selection states
3. Understand icon usage patterns

### Advanced Level
1. Explore `CompleteNavigationDrawer()`
2. Study drawer header customization
3. Learn about sections and dividers

## 🔧 Key Concepts

### 1. Drawer State Management
```kotlin
val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
val scope = rememberCoroutineScope()

// To open drawer
scope.launch { drawerState.open() }

// To close drawer
scope.launch { drawerState.close() }
```

### 2. Navigation Drawer Item
```kotlin
NavigationDrawerItem(
    label = { Text("Home") },
    selected = isSelected,
    onClick = { /* handle click */ },
    icon = { Icon(Icons.Default.Home, contentDescription = null) },
    badge = { Badge { Text("5") } } // Optional
)
```

### 3. Drawer Types

#### Modal Navigation Drawer
```kotlin
ModalNavigationDrawer(
    drawerContent = { ModalDrawerSheet { /* content */ } },
    drawerState = drawerState
) {
    // Main content
}
```

#### Persistent Navigation Drawer
```kotlin
// Custom implementation with conditional visibility
Row {
    if (isDrawerOpen) {
        Surface { /* drawer content */ }
    }
    Box { /* main content */ }
}
```

#### Permanent Navigation Drawer
```kotlin
PermanentNavigationDrawer(
    drawerContent = { PermanentDrawerSheet { /* content */ } }
) {
    // Main content
}
```

## 🎨 Customization Tips

### Custom Header
```kotlin
Column(
    modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.primaryContainer)
        .padding(16.dp)
) {
    // User avatar, name, email
}
```

### Badge Support
```kotlin
NavigationDrawerItem(
    // ... other parameters
    badge = {
        item.badgeCount?.let {
            Badge { Text(text = it.toString()) }
        }
    }
)
```

### Sections and Dividers
```kotlin
HorizontalDivider(
    modifier = Modifier.padding(horizontal = 16.dp),
    color = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
)
```

## 🏆 Best Practices

1. **State Management**
   - Use `rememberDrawerState()` for drawer state
   - Use `rememberCoroutineScope()` for drawer operations

2. **Navigation**
   - Close drawer after item selection
   - Maintain selection state across navigation

3. **Accessibility**
   - Provide proper `contentDescription` for icons
   - Use semantic labels for navigation items

4. **Visual Design**
   - Use consistent spacing with `NavigationDrawerItemDefaults.ItemPadding`
   - Apply proper elevation and colors
   - Consider badge indicators for notifications

5. **Responsive Design**
   - Use Modal drawer for mobile
   - Consider Persistent/Permanent for tablets/desktop

## 🔧 Dependencies Required

Ensure you have these dependencies in your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("androidx.navigation:navigation-compose:2.9.6")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.activity:activity-compose")
}
```

## 🎯 Next Steps

After mastering these examples:
1. Implement Navigation Component integration
2. Add deep linking support
3. Explore nested navigation graphs
4. Study adaptive navigation patterns

## 📱 Preview

All examples include `@Preview` annotations for easy visualization in Android Studio's design panel.

---

**Happy Learning! 🎉**

*This comprehensive tutorial covers everything you need to know about Navigation Drawers in Jetpack Compose.*
