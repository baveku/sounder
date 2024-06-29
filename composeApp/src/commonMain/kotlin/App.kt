import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import sounder.composeapp.generated.resources.Res
import sounder.composeapp.generated.resources.compose_multiplatform
import cafe.adriel.voyager.navigator.*
import cafe.adriel.voyager.navigator.bottomSheet.BottomSheetNavigator
import dev.josbach.features.home.HomeScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        BottomSheetNavigator {
            HomeScreen()
        }
    }
}