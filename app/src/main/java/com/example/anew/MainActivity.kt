 package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

     fun clicked(view: View) {
         val name=findViewById<EditText>(R.id.nameinput)
         val intent= Intent(this,brithday::class.java)
         val name2=name.editableText.toString()
       intent.putExtra("name_extra",name2)
         startActivity(intent)
     }
 }