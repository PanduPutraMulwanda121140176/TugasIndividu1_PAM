package com.example.tugasindividu1

// FormFragment.kt
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout for this fragment
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        // Inisialisasi komponen-komponen form di sini

        return view
    }

    // Fungsi untuk mengambil data dari form
    fun getData(): String {
        // Ambil data dari komponen-komponen form dan gabungkan ke dalam satu string
        return ""
    }
}
