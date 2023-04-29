package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme5 : AppCompatActivity() {
    lateinit var tvbutton7:TextView
    lateinit var tvbutton8:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tvbutton7=findViewById(R.id.tvbutton7)
        tvbutton7.setOnClickListener{
            val intent= Intent(this,meme4::class.java)
            startActivity(intent)
        }
        tvbutton8= findViewById(R.id.tvbutton8)
        tvbutton8.setOnClickListener {
            val intent=Intent(this,meme4::class.java)
            startActivity(intent)


        }
    }
}