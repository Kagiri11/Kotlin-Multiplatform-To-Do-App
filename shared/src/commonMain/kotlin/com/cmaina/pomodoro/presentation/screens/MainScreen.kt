package com.cmaina.pomodoro.presentation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.cmaina.pomodoro.presentation.navigation.PomodoroNavHost

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    PomodoroNavHost(navController)
}