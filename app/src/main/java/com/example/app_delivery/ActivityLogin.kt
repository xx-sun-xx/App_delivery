package com.example.app_delivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app_delivery.databinding.LoginActivityBinding
import com.google.firebase.auth.FirebaseAuth

class ActivityLogin : AppCompatActivity() {

    private lateinit var  binding: LoginActivityBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener {
            val email = binding.EmailLogin.text.toString()
            val pass = binding.PasswordLogin.text.toString()


            if (email.isNotEmpty() && pass.isNotEmpty()){

                    firebaseAuth.signInWithEmailAndPassword(email , pass).addOnCompleteListener {
                        if(it.isSuccessful){
                            val intent = Intent(this, ActivityLogin::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, it.exception.toString() , Toast.LENGTH_SHORT).show()
                        }
                    }
                }else {
                    Toast.makeText(this, "Password is not matching" , Toast.LENGTH_SHORT).show()
                }

        }

        firebaseAuth = FirebaseAuth.getInstance()

        val button: Button = findViewById(R.id.bt_register_login)
        button.setOnClickListener {
            val intent = Intent (this,ActivityRegister::class.java)
            startActivity(intent)
        }
    }

}