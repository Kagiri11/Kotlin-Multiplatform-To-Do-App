import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.composeMultiplatform)
    kotlin("jvm")
}

dependencies{
    implementation(project(":shared"))
    implementation(compose.desktop.currentOs)
    implementation(project(":shared"))
}

compose.desktop{
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.cmaina.pomodoro"
            packageVersion = "1.0.0"
        }
    }
}