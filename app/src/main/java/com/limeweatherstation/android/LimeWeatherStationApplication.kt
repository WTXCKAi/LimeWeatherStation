package com.limeweatherstation.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class LimeWeatherStationApplication : Application() {
    companion object {
        @SuppressLint("StaticFileLeak")
        lateinit var context: Context

        const val TOKEN = "1GzprHmKyX9yNHPk"    //彩云天气API令牌
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}