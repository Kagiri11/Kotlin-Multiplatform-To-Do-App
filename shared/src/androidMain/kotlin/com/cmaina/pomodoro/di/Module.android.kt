package com.cmaina.pomodoro.di

import com.cmaina.pomodoro.data.getDatabaseBuilder
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single { getDatabaseBuilder(ctx = get()) }
}