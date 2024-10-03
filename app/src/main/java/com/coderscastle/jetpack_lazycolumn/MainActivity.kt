package com.coderscastle.jetpack_lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.coderscastle.jetpack_lazycolumn.ui.theme.JetpackLazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            JetpackLazyColumnTheme {
                ListDemo()
            }
        }
    }
}

