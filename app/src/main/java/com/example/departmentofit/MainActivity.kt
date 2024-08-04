package com.example.departmentofit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dirBtn: Button = findViewById<Button>(R.id.btnFacultyStaff)
        val courseBtn: Button = findViewById<Button>(R.id.btnCourses)
        val socialBtn: Button = findViewById<Button>(R.id.btnSocialMedia)
        val admissBtn: Button = findViewById<Button>(R.id.btnAdmissions)
        val emailBtn: Button = findViewById<Button>(R.id.btnEmail)

        dirBtn.setOnClickListener {
            val intent = Intent(this, Directory ::class.java)
            startActivity(intent)
        }
        courseBtn.setOnClickListener {
            val intent = Intent(this, Courses ::class.java)
            startActivity(intent)
        }

        socialBtn.setOnClickListener {
            val intent = Intent(this, Social ::class.java)
            startActivity(intent)
        }

        admissBtn.setOnClickListener {
            val intent = Intent(this, Admissions ::class.java)
            startActivity(intent)
        }

        emailBtn.setOnClickListener {
            val intent = Intent(this, Email ::class.java)
            startActivity(intent)
        }

    }
    }
