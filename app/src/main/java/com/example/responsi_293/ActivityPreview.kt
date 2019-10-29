package com.example.responsi_293

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preview.*
import kotlinx.android.synthetic.main.activity_registrasi.*
import kotlinx.android.synthetic.main.activity_registrasi.view.*

class ActivityPreview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val email = intent.getStringExtra("Email")
        var password = intent.getStringExtra("Password")
        val alamat = intent.getStringExtra("Alamat")

        val output = findViewById<TextView>(R.id.output)
        output.text = "NIM : "+nama+"\nNama: "+email+"\nNilai: "+password+"\nAlamat : "+alamat

        btnLogin.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
