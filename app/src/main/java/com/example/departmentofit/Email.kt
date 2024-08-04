package com.example.departmentofit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Email : AppCompatActivity() {

    private lateinit var sendemail: Button
    private lateinit var subject : EditText
    private lateinit var body: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_email)

        val setTo = findViewById<EditText>(R.id.receiver)
        val to = "itfaculty@ucc.edu.jm"
        setTo.setText(to)

        subject = findViewById(R.id.subject)
        body = findViewById(R.id.body)
        sendemail = findViewById(R.id.send)

        sendemail.setOnClickListener {
            if (subject.text.toString().isEmpty() || body.text.toString().isEmpty()){
                Toast.makeText(this@Email, "Subject or message is missing. Please check your entry.", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_SUBJECT,subject.text.toString())
                intent.putExtra(Intent.EXTRA_TEXT,body.text.toString())

                intent.setType("message/rfc822")
                startActivity(Intent.createChooser(intent,"Choose an email client."))
            }

        }
    }
}


