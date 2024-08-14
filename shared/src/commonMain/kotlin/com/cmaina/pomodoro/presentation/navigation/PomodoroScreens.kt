package com.cmaina.pomodoro.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

enum class PomodoroScreens(
    val route: String,
    val icon: ImageVector = Icons.Default.Home
) {
    Tasks("tasks"),
    Timer("timer"),
    Settings("settings")
}