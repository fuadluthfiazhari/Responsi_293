package com.example.responsi_293

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registrasi.*

class ActivityRegistrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        btndaftar.setOnClickListener {
            val nama = nama.text.toString()
            val email = email.text.toString()
            val password = password.text.toString()
            val alamat = alamat.text.toString()

            val intent = Intent(this@ActivityRegistrasi, ActivityPreview::class.java)
            startActivity(intent)
            intent.putExtra("Nama", nama)
            intent.putExtra("Email", email)
            intent.putExtra("Password", password)
            intent.putExtra("Alamat", alamat)
            startActivity(intent)
        }
    }
}
