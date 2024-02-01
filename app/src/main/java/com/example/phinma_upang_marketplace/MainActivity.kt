package com.example.phinma_upang_marketplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var signview: TextView

<<<<<<< HEAD
class MainActivity : AppCompatActivity() {
=======
>>>>>>> f5eb8a2 (New XML Layout and code for going into sign up page)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signview.setOnClickListener{
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}