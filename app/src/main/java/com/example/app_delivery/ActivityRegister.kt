package com.example.app_delivery

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app_delivery.databinding.RegisterActivityBinding
import com.google.firebase.auth.FirebaseAuth

class ActivityRegister : AppCompatActivity() {

    private lateinit var  binding: RegisterActivityBinding
    private lateinit var firebaseAuth: FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = RegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.jaTemUmaConta.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }
        binding.buttonRegisteraccount.setOnClickListener {
            val nome = binding.nome.text.toString()
            val email = binding.EmailAddress.text.toString()
            val pass = binding.Password.text.toString()
            val confirmPass = binding.confirmPassword.text.toString()


            if (nome.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()){
                if (pass == confirmPass){

                    firebaseAuth.createUserWithEmailAndPassword(email , pass).addOnCompleteListener {
                        if(it.isSuccessful){
                            val intent = Intent(this, ActivityRegister::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, it.exception.toString() , Toast.LENGTH_SHORT).show()
                        }
                    }
                }else {
                            Toast.makeText(this, "Password is not matching" , Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Empty Fields Are not Allowed !!" , Toast.LENGTH_SHORT).show()
            }

        }




        val button: Button = findViewById(R.id.button_registeraccount)
        button.setOnClickListener {
            val intent = Intent (this,ActivityLogin::class.java)
            startActivity(intent)
        }
    }
}