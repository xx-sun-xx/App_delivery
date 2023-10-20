package com.example.app_delivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        val button: Button = findViewById(R.id.button_inicio)
        button.setOnClickListener {
            val intent = Intent (this,ActivityLogin::class.java)
            startActivity(intent)
        }

    }
}
