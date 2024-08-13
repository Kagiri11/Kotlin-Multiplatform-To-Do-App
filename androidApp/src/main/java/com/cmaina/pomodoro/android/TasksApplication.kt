package com.cmaina.pomodoro.android

import android.app.Application
import com.cmaina.pomodoro.di.initKoin
import org.koin.android.ext.koin.androidContext

class TasksApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@TasksApplication)
        }
    }

}