package com.example.departmentofit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.departmentofit.R.*
import com.example.departmentofit.R.id.*

class Admissions : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_admissions)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(textView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val arrayAdmin : ArrayAdapter<*>
        val reqs = arrayOf(
            "Most recent transcript",
            "Seventeen (17) years and older",
            "Birth Certificate",
            "At least five (5) CSEC or GCE subjects with grades I, II, III or A, B, C respectively",
            "Passes must include Mathematics and English Language",
            "Passes must include a subject linked to area of study"
        )

        var admissListView = findViewById<ListView>(requirements)
        arrayAdmin = ArrayAdapter(this, android.R.layout.simple_list_item_1,reqs)
        admissListView.adapter = arrayAdmin

        val applyOnline = findViewById<TextView>(R.id.ucclink)
        applyOnline.movementMethod = LinkMovementMethod.getInstance()

        val backBtn: Button = findViewById(back)

        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }
    }
}