package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvnext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnext = findViewById(R.id.tvnext)
        tvnext.setOnClickListener {
           val intent=Intent(this,Meme2::class.java)
            startActivity(intent)
        }
    }

}