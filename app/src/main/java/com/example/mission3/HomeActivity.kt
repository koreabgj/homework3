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
import android.util.Log
import android.view.animation.AnimationUtils

class HomeActivity : Activity()

class HomeActivityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val id = intent.getStringExtra("id")
        val pw = intent.getStringExtra("pw")

        if (id == null || pw == null) {
            finish()
        }

        val image: ImageView = findViewById(R.id.imageView)
        // 랜덤으로 선택한 이미지를 이미지뷰에 설정
        val imageArray = arrayOf(
            R.drawable.koreabgj,
            R.drawable.dice_1,
            R.drawable.dice_3,
        )
        val randomImage = imageArray.random()
        image.setImageResource(randomImage)

        val text1: TextView = findViewById(R.id.name)

        val text2: TextView = findViewById(R.id.wording)

        val text3: TextView = findViewById(R.id.true_false)
        // 텍스트 애니메이션 효과
        val animation = AnimationUtils.loadAnimation(this, R.anim.text_effect)
        text3.startAnimation(animation)

        val text4: TextView = findViewById(R.id.mbti)

        val button1: Button = findViewById(R.id.button1)
        // 1주차 미니프로젝트에서 사용했던 기능
        button1.paintFlags = button1.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        button1.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://lionbae.tistory.com")))
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            finish()
        }
    }
}