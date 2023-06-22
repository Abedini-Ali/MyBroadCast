package com.ali.mybroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        var isAriePlane : Boolean = intent!!.getBooleanExtra("state",false)

        if (isAriePlane){
            Toast.makeText(context, "در حالت هواپیما قرار دارید.", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "در حالت عادی هستید.", Toast.LENGTH_LONG).show()
        }

    }
}