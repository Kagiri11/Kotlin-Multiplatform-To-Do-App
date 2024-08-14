package com.cmaina.pomodoro.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(appModules())
    }

fun initKoin() = initKoin {}

fun appModules() = listOf(sharedModule, platformModule())