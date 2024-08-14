package com.cmaina.pomodoro.data

import androidx.room.Room
import androidx.room.RoomDatabase
import java.io.File


fun getDatabaseBuilder(): RoomDatabase.Builder<TasksDatabase> {
    val dbFile = File(System.getProperty("java.io.tmpdir"), "tasks.db")
    return Room.databaseBuilder<TasksDatabase>(
        name = dbFile.absolutePath,
    )
}