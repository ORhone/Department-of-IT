package com.example.departmentofit

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Social : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_social)

        val facebookPage: WebView = findViewById(R.id.facebook)
        facebookPage.loadUrl("https://web.facebook.com/uccjamaica?_rdc=1&_rdr")

        val twitterPage: WebView = findViewById(R.id.twitter)
        twitterPage.loadUrl("https://x.com/UCCjamaica")

        val igPage: WebView = findViewById(R.id.instagram)
        igPage.loadUrl("https://www.instagram.com/uccjamaica")

        val backBtn: Button = findViewById(R.id.back)

        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }
    }
}