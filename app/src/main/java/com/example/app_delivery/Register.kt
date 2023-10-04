package com.example.app_delivery

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val button: Button = findViewById(R.id.button_registeraccount)
        button.setOnClickListener {
            val intent = Intent (this,Login::class.java)
            startActivity(intent)
        }
    }
}