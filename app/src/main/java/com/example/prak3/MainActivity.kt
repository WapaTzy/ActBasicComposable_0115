package com.example.prak3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge // Pastikan ini ada
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.prak3.ui.theme.Prak3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Tambahkan baris ini agar aplikasi menembus status bar dan navbar
        enableEdgeToEdge()

        setContent {
            Prak3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // 2. Hapus parameter padding di sini agar background bisa full
                    HalamanLogin()

                }
            }
        }
    }
}