package com.cmaina.pomodoro.presentation.screens.tasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cmaina.pomodoro.presentation.components.TaskListItem
import com.cmaina.pomodoro.presentation.ui.theme.DeepPurple
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun TasksScreen(
    tasksViewModel: TaskViewModel = koinViewModel(),
) {
    val uiState by tasksViewModel.uiState.collectAsState()
    Surface(
        modifier = Modifier.background(DeepPurple),
        color = DeepPurple
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Select or add a task",
                color = Color.White,
                style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(20.dp))
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                items(uiState.tasks) { task ->
                    TaskListItem(title = task.title)
                }
            }
        }
    }

}