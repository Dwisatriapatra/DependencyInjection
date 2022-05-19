package com.example.dependencyinjection


import com.example.dependencyinjection.tugas.MesinKonversi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun namamurid() : Student{
        return Student()
    }

    @Singleton
    @Provides
    fun konversi() : MesinKonversi{
        return MesinKonversi()
    }

}