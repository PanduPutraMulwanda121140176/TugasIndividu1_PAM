package com.example.tugasindividu1

// DisplayDataActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DisplayDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)

        // Ambil data dari intent dan tampilkan di TextView
        val data = intent.getStringExtra("data")
        // Tampilkan data di TextView
    }
}
