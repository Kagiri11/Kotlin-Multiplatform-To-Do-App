 plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.ksp)
    alias(libs.plugins.room)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    jvm("desktop")

    sourceSets {
        sourceSets["commonMain"].dependencies {
            implementation(libs.androidx.datastore)
            implementation(libs.androidx.datastore.preferences.core)

            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.materialIconsExtended)
            implementation(compose.components.resources)

            implementation(libs.material3.window.size)
            implementation(libs.navigation.compose)

            implementation(libs.room.runtime)
            implementation(libs.sqlite.bundled)


            api(libs.koin.core)

            implementation(libs.kotlin.coroutines.core)
            implementation(libs.koin.composeVM)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        sourceSets["desktopMain"].dependencies {
            implementation(libs.kotlin.coroutines.core)
            implementation(libs.kotlinx.coroutines.swing)
        }
    }
}

room {
    schemaDirectory("$projectDir/schemas")
}

android {
    namespace = "com.cmaina.pomodoro"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    ksp(libs.room.compiler)
}
