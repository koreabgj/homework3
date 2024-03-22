package com.example.mission3
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Paint
import android.view.animation.AnimationUtils

class HomeActivity : Activity()

class HomeActivityActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val image1: ImageView = findViewById(R.id.koreabgj)
        image1.setImageResource(R.drawable.koreabgj)

        val text1: TextView = findViewById(R.id.name)
        val text2: TextView = findViewById(R.id.wording)

        val text3: TextView = findViewById(R.id.true_false)
        // 애니메이션 리소스 가져오기
        val animation = AnimationUtils.loadAnimation(this, R.anim.text_effect)
        // 텍스트뷰에 애니메이션 적용
        text3.startAnimation(animation)

        val text4: TextView = findViewById(R.id.mbti)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://lionbae.tistory.com")))
        }
        button1.paintFlags = text3.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            finish()
        }
    }
}