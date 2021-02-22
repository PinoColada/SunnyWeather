package com.example.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    companion object {
        const val TOKEN ="xGeYb0FIoUWoUq1b"
        @SuppressWarnings("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}