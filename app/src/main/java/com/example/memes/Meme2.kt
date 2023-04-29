package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Meme2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var tvbutton1:TextView
        lateinit var tvbutton2:TextView
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_meme2)
        tvbutton1= findViewById(R.id.tvbutton1)
        tvbutton1.setOnClickListener {
            val intent=Intent(this,meme3::class.java)
            startActivity(intent)
        }
        tvbutton2= findViewById(R.id.tvbutton2)
        tvbutton2.setOnClickListener {
            val intent=Intent(this,meme3::class.java)
            startActivity(intent)
        }
    }
}