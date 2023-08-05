package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn3 = findViewById<Button>(R.id.btn_createAcount2)
        btn3.setOnClickListener {
            val name = findViewById<EditText>(R.id.Name2)
            val c_id = findViewById<EditText>(R.id.CreateId2)
            val c_pw = findViewById<EditText>(R.id.CreatePassword2)

            if(name.length() == 0){
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }

            else if(c_id.length() == 0){
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }

            else if(c_pw.length() == 0){
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(applicationContext, "회원가입 완료", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}