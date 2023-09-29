package com.example.app_delivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_start)

        val button: Button = findViewById(R.id.button_inicio)
        button.setOnClickListener {
            val intent = Intent (this,Login::class.java)
            startActivity(intent)
            }

        }
    }
