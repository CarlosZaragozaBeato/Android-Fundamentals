package com.carloszaragoza.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.btnStart)
        val stop = findViewById<Button>(R.id.btnStop)
        val sendData = findViewById<Button>(R.id.btnSendData)
        val serviceInfo = findViewById<TextView>(R.id.tvStatus)
        val etData = findViewById<EditText>(R.id.etData)

        start.setOnClickListener{
            Intent(this, MyService::class.java).also {
                startService(it)
                serviceInfo.text = "Service Running"
            }
        }
        stop.setOnClickListener{
            Intent(this, MyService::class.java).also {
                stopService(it)
                serviceInfo.text = "Service Stopped"
            }
        }
        sendData.setOnClickListener{
            Intent(this, MyService::class.java).also {
                val data = etData.text.toString()
                it.putExtra("EXTRA_DATA",data)
                startService(it)
            }
        }

    }
}