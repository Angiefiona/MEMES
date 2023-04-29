package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme3 : AppCompatActivity() {
    lateinit var tvbutton3:TextView
    lateinit var tvbutton4:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tvbutton3=findViewById(R.id.tvbutton3)
        tvbutton3.setOnClickListener{
            val intent= Intent(this,meme4::class.java)
            startActivity(intent)
        }
        tvbutton4= findViewById(R.id.tvbutton4)
        tvbutton4.setOnClickListener {
            val intent=Intent(this,meme4::class.java)
            startActivity(intent)


            }
    }
}