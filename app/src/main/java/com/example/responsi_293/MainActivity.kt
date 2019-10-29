package com.example.responsi_293

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbtn.setOnClickListener {
            val email = user.text.toString()
            val password = pass.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Masukan Email dan Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "fuad@gmail.com" || password == "293") {
                val intent = Intent(this, ActivityPreview::class.java)
                startActivity(intent)
            }
        }


        btnregistrasi.setOnClickListener{
            val intent = Intent (this, ActivityRegistrasi::class.java)
            startActivity(intent)
        }
    }
}

