package com.example.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.amphibians.ui.AmphibiansApp
import com.example.amphibians.ui.theme.AmphibiansTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menetapkan konten aktivitas menggunakan Jetpack Compose
        setContent {
            // Menggunakan tema kustom yang telah ditentukan dalam AmphibiansTheme
            AmphibiansTheme {
                // Container permukaan menggunakan warna 'background' dari tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Merender konten utama aplikasi menggunakan AmphibiansApp
                    AmphibiansApp()
                }
            }
        }
    }
}
