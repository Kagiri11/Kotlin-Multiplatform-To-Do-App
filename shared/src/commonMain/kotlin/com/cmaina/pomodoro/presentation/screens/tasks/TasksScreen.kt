package com.cmaina.pomodoro.presentation.screens.tasks

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun TasksScreen(
    tasksViewModel: TaskViewModel = koinViewModel(),
) {

    val uiState by tasksViewModel.uiState.collectAsState()

    LazyColumn {
        items(uiState.tasks.size) { index ->
            Text(text = uiState.tasks[index].title)
        }
    }

}