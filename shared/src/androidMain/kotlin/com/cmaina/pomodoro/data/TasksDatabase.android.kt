package com.cmaina.pomodoro.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase


fun getDatabaseBuilder(ctx: Context): RoomDatabase.Builder<TasksDatabase> {
    val appContext = ctx.applicationContext
    val dbFile = appContext.getDatabasePath("tasks.db")
    return Room.databaseBuilder<TasksDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}