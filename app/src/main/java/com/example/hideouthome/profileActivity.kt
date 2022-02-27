package com.example.hideouthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val button3 = findViewById<Button>(R.id.homeButton)

        button3.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val button = findViewById<Button>(R.id.friendButton)

        button.setOnClickListener{
            val intent = Intent(this,friendActivity::class.java)
            startActivity(intent)
            finish()
        }

        val button1 = findViewById<Button>(R.id.searchButton)

        button1.setOnClickListener{
            val intent = Intent(this,searchActivity::class.java)
            startActivity(intent)
            finish()
        }

        val button4 = findViewById<Button>(R.id.libraryButton)

        button4.setOnClickListener{
            val intent = Intent(this,libraryActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}