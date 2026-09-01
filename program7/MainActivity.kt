package com.example.explicitintents

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnIndexSendButtonClicked(view: View?) {
        val editText = findViewById<EditText>(R.id.editTextIndex)
        val index = editText.text.toString()

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("ImageIndex", index)

        startActivity(intent)
    }
}
