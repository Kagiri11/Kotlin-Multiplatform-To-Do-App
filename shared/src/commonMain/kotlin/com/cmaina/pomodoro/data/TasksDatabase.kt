package com.cmaina.pomodoro.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.cmaina.pomodoro.domain.models.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TasksDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}

fun provideTasksDatabase(
    builder: RoomDatabase.Builder<TasksDatabase>
): TasksDatabase {
    return builder
        .fallbackToDestructiveMigrationOnDowngrade(false)
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}