package com.example.alertdialog

import android.content.DialogInterface
import android.content.DialogInterface.OnShowListener
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog




class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById(R.id.btn)
        btn.setOnClickListener{
            customAlert()
        }


    }

    private fun customAlert(){

        val input = EditText(this)


        val dialogBuilder = AlertDialog.Builder(this)
            .setTitle(" Greetings ")
            .setMessage("Enter your Name:")
            .setPositiveButton("Tv",null)
            .setNegativeButton("go",null)
            .setView(input)
            .show()

        val Pbtn: Button= dialogBuilder.getButton(AlertDialog.BUTTON_POSITIVE)

        Pbtn.setOnClickListener{
          var st= input.text.toString()
            input.setText("hello : " +st)


        }

        val Nbtn: Button= dialogBuilder.getButton(AlertDialog.BUTTON_NEGATIVE)

        Nbtn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("str", input.text.toString())
            startActivity(intent)
            }

    }



}