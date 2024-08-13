package com.cmaina.pomodoro.domain.repository

import com.cmaina.pomodoro.data.TaskDao
import com.cmaina.pomodoro.domain.models.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class TaskRepository(
    private val taskDao: TaskDao
) {
    suspend fun getAllTasks(): Flow<List<Task>> = flowOf()

    suspend fun getTaskById(id: Long): Task? = null

    suspend fun insertTask(task: Task) {

    }

    suspend fun updateTask(task: Task) {

    }

    suspend fun deleteTask(task: Task) {

    }
}