package com.example.mission3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.mission3.R.id.button1
import com.example.mission3.R.id.button2

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val imageView: ImageView = findViewById(R.id.sparta)
        val textView: TextView = findViewById(R.id.Text1)
        val editText1: EditText = findViewById(R.id.editText1)
        val textView2: TextView = findViewById(R.id.Text2)
        val editText2: EditText = findViewById(R.id.editText2)
        val button1: Button = findViewById<Button>(R.id.button1)
        val button2: Button = findViewById<Button>(R.id.button2)

        imageView.setImageResource(R.drawable.sparta)
        val id = intent.getStringExtra("id")
        val pw = intent.getStringExtra("pw")
        editText1.setText(id)
        editText2.setText(pw)

        button1.setOnClickListener {
            val id1 = editText1.text.toString()
            val pw1 = editText2.text.toString()

            if (id1.isBlank() || pw1.isBlank()) {
                Toast.makeText(this, "아이디와 비밀번호를 확인해 주세요", Toast.LENGTH_SHORT).show()

            } else {
                button1.isEnabled = true

                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("id", id)
                intent.putExtra("pw", pw)
                startActivity(intent)

                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
            }
        }

        button2.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}