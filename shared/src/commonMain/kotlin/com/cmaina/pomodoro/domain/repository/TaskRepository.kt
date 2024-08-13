package com.cmaina.pomodoro.domain.repository

import com.cmaina.pomodoro.data.TaskDao
import com.cmaina.pomodoro.domain.models.Task
import kotlinx.coroutines.flow.Flow

class TaskRepository(
    private val taskDao: TaskDao
) {
    suspend fun getAllTasks(): Flow<List<Task>> = taskDao.getAllTasks()

    suspend fun getTaskById(id: Long): Task? = taskDao.getTaskById(id)

    suspend fun insertTask(task: Task) = taskDao.addTask(task)

    suspend fun deleteTask(task: Task) = taskDao.deleteTask(task.id)
}