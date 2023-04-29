package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme4: AppCompatActivity() {
    lateinit var tvbutton5:TextView
    lateinit var tvbutton6:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tvbutton5=findViewById(R.id.tvbutton5)
        tvbutton5.setOnClickListener{
            val intent= Intent(this,meme4::class.java)
            startActivity(intent)
        }
        tvbutton6= findViewById(R.id.tvbutton6)
        tvbutton6.setOnClickListener {
            val intent=Intent(this,meme4::class.java)
            startActivity(intent)


        }
    }
}