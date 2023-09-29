package com.example.app_delivery

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carregamento_splash)

        Handler(Looper.getMainLooper()) .postDelayed({
            val intent = Intent(this,Start::class.java)
            startActivity(intent)
            finish()
        },30000)
    }
}
