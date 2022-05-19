package com.example.dependencyinjection.tugas

class MesinKonversi {

    fun konversiNilai(a : Int) : String{
        return if(a in 85..100){
            "A"
        }else if(a in 75..84){
            "B"
        }else if(a in 60..74){
            "C"
        }else if(a in 50..59){
            "D"
        }else{
            "Diluar kategori"
        }
    }
}