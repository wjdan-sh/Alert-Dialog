package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tv=findViewById(R.id.tv)

        val str = intent.getStringExtra("str")
        tv.text = str.toString()
    }
}