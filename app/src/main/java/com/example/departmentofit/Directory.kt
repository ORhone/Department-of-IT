package com.example.departmentofit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.text.trim as trim

class Directory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_directory)

        val callNeil: Button = findViewById(R.id.callneil)
        val emailNeil: Button = findViewById(R.id.emailneil)

        val callPam: Button = findViewById(R.id.callpam)
        val emailPam: Button = findViewById(R.id.emailpam)

        val callHod: Button = findViewById(R.id.callhod)
        val emailHod: Button = findViewById(R.id.emailhod)

        val backBtn: Button = findViewById(R.id.back)

        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        emailHod.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("message/rfc822")
            startActivity(Intent.createChooser(intent,"Choose an email client."))
        }

        emailPam.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("message/rfc822")
            startActivity(Intent.createChooser(intent,"Choose an email client."))
        }

        emailNeil.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("message/rfc822")
            startActivity(Intent.createChooser(intent,"Choose an email client."))
        }

    }
}