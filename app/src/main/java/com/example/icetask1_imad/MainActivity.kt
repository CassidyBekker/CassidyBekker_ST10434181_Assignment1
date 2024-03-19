package com.example.icetask1_imad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)
        val EditText = findViewById<EditText>(R.id.inNum)

        button.setOnClickListener {
        // create the explicit intent
            val intent = Intent(this,MultiplicationTable::class.java )
        // add table number to intent
            intent.putExtra("tableNumber",EditText.text.toString())
        // start activity
            startActivity(intent)
        }


    }
}