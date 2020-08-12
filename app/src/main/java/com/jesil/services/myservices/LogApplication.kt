package com.jesil.services.myservices

import android.app.Application
import timber.log.Timber

/**
 * Created by Jesil Toborowei
 * @2020
 * */

class LogApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}