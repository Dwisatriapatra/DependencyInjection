package com.example.dependencyinjection.tugas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjection.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {
    @Inject
    lateinit var mesinKonversi: MesinKonversi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button_konversi.setOnClickListener {
            konversiNilai()
        }
    }

    private fun konversiNilai() {
        val a = inputan_angka.text.toString().toInt()
        result_konversi.text = mesinKonversi.konversiNilai(a)
    }
}