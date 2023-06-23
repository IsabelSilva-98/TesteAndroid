package com.example.a05_multiplesactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_multiplesactivity.databinding.ActivityLoginBinding
import com.example.a05_multiplesactivity.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /*binding.button.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }*/

        binding.button.setOnClickListener {
            finish()
        }
    }
}