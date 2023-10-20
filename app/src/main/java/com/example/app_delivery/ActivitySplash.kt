package com.example.app_delivery

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class ActivitySplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        Handler(Looper.getMainLooper()) .postDelayed({
            val intent = Intent(this,ActivityStart::class.java)
            startActivity(intent)
            finish()
        },300000)
    }
}
