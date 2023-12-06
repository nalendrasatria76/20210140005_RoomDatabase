package com.example.roomsiswa.navigasi

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roomsiswa.ui.halaman.DestinasiEntry
import com.example.roomsiswa.ui.halaman.DestinasiHome
import com.example.roomsiswa.ui.halaman.EntrySiswaScreen
import com.example.roomsiswa.ui.halaman.HomeScreen

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()) {
    HostNavigasi(navController = navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaTopAppBar(
    title: String,
    canNavigateBack: Boolean,
    modifier: androidx.compose.ui.Modifier.Companion = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    navigateUp: () -> Unit = {}
) {
    // Implementation of SiswaTopAppBar
}

@Composable
fun HostNavigasi(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = DestinasiHome.route, modifier = modifier) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
    }
}
