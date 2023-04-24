package com.example.intent1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passDataButton = findViewById<Button>(R.id.passDataButton)
        val editText = findViewById<EditText>(R.id.editText)

        passDataButton.setOnClickListener {
            val message = editText.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", message)
            startActivity(intent)
        }
    }
}
