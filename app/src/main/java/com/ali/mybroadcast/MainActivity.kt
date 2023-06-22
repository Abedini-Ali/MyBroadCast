package com.ali.mybroadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val br = BroadcastExample()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intFilter = IntentFilter()
        intFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(br, intFilter)

    }

    override fun onStart() {
        super.onStart()
//        val intFilter = IntentFilter()
//        intFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
//        this.registerReceiver(br, intFilter)
    }

    override fun onStop() {
        super.onStop()
//        this.unregisterReceiver(br)
    }

}