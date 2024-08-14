package com.cmaina.pomodoro.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val status: TaskStatus
)
