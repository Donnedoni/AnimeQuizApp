package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName :TextView = findViewById(R.id.tvName)
        val tvScore : TextView = findViewById(R.id.tvScore)
        val tvImage:ImageView = findViewById(R.id.image)
        val btnFinish : Button = findViewById(R.id.btnFinish)


        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore.text = "Your Score is ${intent.getIntExtra(Constants.CORRECT_ANSWERS,0)} out of ${intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)}"

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}