package com.example.mission3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.mission3.R.id.button1
import com.example.mission3.R.id.button2

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val imageView: ImageView = findViewById(R.id.sparta)
        val textView1: TextView = findViewById(R.id.Text1)
        val editText1: EditText = findViewById(R.id.editText1)
        val textView2: TextView = findViewById(R.id.Text2)
        val editText2: EditText = findViewById(R.id.editText2)
        val textView3: TextView = findViewById(R.id.Text3)
        val editText3: EditText = findViewById(R.id.editText3)
        val button: Button = findViewById(R.id.button)

        imageView.setImageResource(R.drawable.sparta)

        button.setOnClickListener {
            val name = editText1.text.toString()
            val id = editText2.text.toString()
            val pw = editText3.text.toString()

            if (name.isBlank() || id.isBlank() || pw.isBlank()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "회원가입이 완료되었습니다", Toast.LENGTH_SHORT).show()

                intent.putExtra("id", id)
                intent.putExtra("pw", pw)
                finish()
            }
        }
    }
}