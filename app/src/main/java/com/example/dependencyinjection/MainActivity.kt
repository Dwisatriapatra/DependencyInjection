package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var student : Student
//    @Inject
//    lateinit var stringSatu: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //textview_satu.text = namaStudent.nameStudent()

        button_hitung.setOnClickListener {
            hitung()
        }
    }

    fun hitung(){
        val angkaSatu = inputan_angka_satu.text.toString().toInt()
        val angkaDua = inputan_angka_dua.text.toString().toInt()

        val di = student.hitungJumlah(angkaSatu, angkaDua)
        result.text = di.toString()

    }
}