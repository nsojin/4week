package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val btn1 = findViewById<Button>(R.id.btn_logIn)
        btn1.setOnClickListener {
            val id = findViewById<EditText>(R.id.Id2).text.toString()
            val password = findViewById<EditText>(R.id.password2).text.toString()

            if (id.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromSignInActivity", id)
                startActivity(intent)
                Toast.makeText(applicationContext, "로그인 성공!", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(applicationContext, "아이디 또는 비밀번호를 입력해 주세요.", Toast.LENGTH_SHORT).show()
            }
        }

        val id = findViewById<EditText>(R.id.Id2)
        val password = findViewById<EditText>(R.id.password2)
        val data = intent.getStringExtra("dataFromSignUpActivity")
        val data2 = intent.getStringExtra("dataFromSignUpActivity2")
        id.setText(data)
        password.setText(data2)

        val btn2 = findViewById<Button>(R.id.btn_createAcount)
        btn2.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}