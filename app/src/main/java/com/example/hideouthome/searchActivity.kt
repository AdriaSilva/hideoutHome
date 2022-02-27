package com.example.hideouthome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class searchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
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

        val button4 = findViewById<Button>(R.id.libraryButton)

        button4.setOnClickListener{
            val intent = Intent(this,libraryActivity::class.java)
            startActivity(intent)
            finish()
        }

        val button5 = findViewById<Button>(R.id.profileButton)

        button5.setOnClickListener{
            val intent = Intent(this,profileActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}