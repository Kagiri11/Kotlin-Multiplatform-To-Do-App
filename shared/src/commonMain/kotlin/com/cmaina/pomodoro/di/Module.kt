package com.cmaina.pomodoro.di

import com.cmaina.pomodoro.data.TasksDatabase
import com.cmaina.pomodoro.data.provideTasksDatabase
import com.cmaina.pomodoro.domain.repository.TaskRepository
import com.cmaina.pomodoro.presentation.screens.tasks.TaskViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module

val sharedModule = module {
    single { provideTasksDatabase(builder = get()) }
    single { get<TasksDatabase>().taskDao() }
    single { TaskRepository(taskDao = get()) }

    viewModelOf(::TaskViewModel)
}

expect fun platformModule(): Module