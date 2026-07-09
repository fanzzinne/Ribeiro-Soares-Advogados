import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.example.ribeirosoaresadvogados.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow(title = "Ribeiro Soares Advogados", canvasElementId = "ComposeTarget") {
        App()
    }
}
