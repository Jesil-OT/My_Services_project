package com.jesil.services.myservices

import android.app.Service
import android.content.Intent
import android.os.IBinder
import timber.log.Timber

class MyStartedService : Service() {

    override fun onCreate() {
        super.onCreate()
        Timber.i("onCreate, Thread name %s", Thread.currentThread().name)
    }

    override fun onBind(intent: Intent?): IBinder? {
        Timber.i("onBind, Thread name%s", Thread.currentThread().name)
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Timber.i("onStartCommand, Thread name%s", Thread.currentThread().name)

        // perform Task [ Short Duration Task: Don't block the UI ]

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy, Thread name%s", Thread.currentThread().name)

    }
}