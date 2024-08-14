package com.cmaina.pomodoro.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cmaina.pomodoro.presentation.screens.tasks.TasksScreen
import com.cmaina.pomodoro.presentation.screens.timer.TimerScreen

@Composable
fun PomodoroNavHost(
    navController: NavHostController,
    startDestination: String = PomodoroScreens.Tasks.route,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = PomodoroScreens.Tasks.route) {
            TasksScreen()
        }
        composable(route = PomodoroScreens.Timer.route) {
            TimerScreen()
        }
    }
}