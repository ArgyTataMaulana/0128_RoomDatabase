package com.argy.a0128_roomdatabase

import android.app.Application
import com.argy.a0128_roomdatabase.repositori.ContainerApp
import com.argy.a0128_roomdatabase.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}
