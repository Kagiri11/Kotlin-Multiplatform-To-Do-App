package com.cmaina.pomodoro.presentation.screens.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cmaina.pomodoro.domain.models.Task
import com.cmaina.pomodoro.domain.models.TaskStatus
import com.cmaina.pomodoro.domain.repository.TaskRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class TaskViewModel(
    private val taskRepository: TaskRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(TasksScreenUiState())
    val uiState = _uiState.asStateFlow()

    init {
        fetchTasks()
    }

    private fun fetchTasks() {
        viewModelScope.launch {
            val tasks = buildList<Task> {
                repeat(5) {
                    add(Task(title = "Task $it", status = TaskStatus.TODO))
                }
            }
            _uiState.update { it.copy(tasks = tasks) }
           /* taskRepository.getAllTasks().collect { tasks ->

            }*/
        }
    }


}

data class TasksScreenUiState(
    val tasks: List<Task> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)