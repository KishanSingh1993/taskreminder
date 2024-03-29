package `in`.eduforyou.taskreminder.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import `in`.eduforyou.taskreminder.todo.Finder
import `in`.eduforyou.taskreminder.todo.Setter
import `in`.eduforyou.taskreminder.todo.TOODO
import `in`.eduforyou.taskreminder.todo.UpdateTask


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.TOODO.route) {
            TOODO(navController = navController)
        }
        composable(route = Screen.Setter.route) {
            Setter(navController = navController)
        }
        composable(route = Screen.Finder.route) {
            Finder(navController = navController)
        }
        composable(
            route = Screen.UpdateTask.route,
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {
            UpdateTask(navController = navController)
        }
    }
}