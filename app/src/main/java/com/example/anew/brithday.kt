package com.example.anew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class brithday : AppCompatActivity() {
    companion object{

        const val name_extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brithday)
        val username=intent.getStringExtra("name_extra")
       val textuser=findViewById<TextView>(R.id.user)
        textuser.text="Happy Birthday \n $username!"
    }
}