package com.example.tugasindividu1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tambahkan kode untuk menampilkan form di sini

        // MainActivity.kt

        // Di dalam onCreate() di MainActivity

        // Tambahkan kode untuk menampilkan form
        val formFragment = FormFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, formFragment)
            .commit()

        // Tambahkan tombol untuk pindah ke halaman kedua
        val buttonSubmit: Button = findViewById(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener {
            val data = formFragment.getData() // Ambil data dari form
            displayData(data) // Pindah ke halaman kedua dengan data yang diinputkan
        }
    }

    // Fungsi untuk menampilkan halaman kedua dengan data yang diinputkan
    fun displayData(data: String) {
        val intent = Intent(this, DisplayDataActivity::class.java)
        intent.putExtra("data", data)
        startActivity(intent)
    }
}
