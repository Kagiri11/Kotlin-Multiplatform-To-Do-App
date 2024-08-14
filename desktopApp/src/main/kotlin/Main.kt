import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.cmaina.pomodoro.di.initKoin
import com.cmaina.pomodoro.presentation.screens.tasks.TasksScreen
import org.koin.core.Koin

lateinit var koin: Koin

fun main() {
    koin = initKoin().koin
    return application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Pomodoro"
        ) {
            TasksScreen()
        }
    }
}