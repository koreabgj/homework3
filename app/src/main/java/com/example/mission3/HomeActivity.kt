package com.example.mission3
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : Activity()

class HomeActivityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val imageView: ImageView = findViewById(R.id.koreabgj)
        imageView.setImageResource(R.drawable.koreabgj)







        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            // 종료 버튼이 눌리면 SignInActivity로 이동
            finish()
        }
    }
}