package com.jesil.services.myservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startStartedService(view: View) {
        val intent = Intent(this@MainActivity, MyStartedService::class.java)
        startService(intent)

    }

    fun stopStartedService(view: View) {
        val intent = Intent(this@MainActivity, MyStartedService::class.java)
        stopService(intent)

    }
}