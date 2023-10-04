package com.example.app_delivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.login)

        val button: Button = findViewById(R.id.bt_register_login)
        button.setOnClickListener {
            val intent = Intent (this,Register::class.java)
            startActivity(intent)
        }
    }
}