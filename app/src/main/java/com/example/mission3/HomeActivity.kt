package com.example.mission3
import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : Activity()

class HomeActivityActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val image1: ImageView = findViewById(R.id.koreabgj)
        image1.setImageResource(R.drawable.koreabgj)

        val text1: TextView = findViewById(R.id.name)






        val text2: TextView = findViewById(R.id.mbti)

        val text3: TextView = findViewById(R.id.blogTextView)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            // 종료 버튼이 눌리면 SignInActivity로 이동
            finish()
        }
    }
}