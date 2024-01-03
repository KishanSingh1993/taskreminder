package `in`.eduforyou.taskreminder.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavController
import `in`.eduforyou.taskreminder.GifImageExample
import `in`.eduforyou.taskreminder.R
import `in`.eduforyou.taskreminder.ui.theme.GradientBackgroundBrush
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(2500L)
        navController.popBackStack()
        navController.navigate(Screen.TOODO.route)
    }

    val gradientColors = listOf(
        Color(0xFF000000),
        Color(0xFF3533cd)
    )

    Box(
        modifier = Modifier
            .background(brush = GradientBackgroundBrush(isVerticalGradient = false, colors = gradientColors))
            .fillMaxSize(),
        Alignment.Center,
    ){
        GifImageExample(
            data = R.drawable.workreminder,
            backgroundColor = Color.Transparent,
            contentAlignment = Alignment.Center,
            contentScale = ContentScale.Crop
        )
    }
}