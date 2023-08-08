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
            val name = findViewById<EditText>(R.id.Name2).text.toString()
            val c_id = findViewById<EditText>(R.id.CreateId2).text.toString()
            val c_pw = findViewById<EditText>(R.id.CreatePassword2).text.toString()

            if(name.isNotEmpty() && c_id.isNotEmpty() && c_pw.isNotEmpty()){
                val intent = Intent(this,SignInActivity::class.java)
                intent.putExtra("dataFromSignUpActivity",c_id)
                intent.putExtra("dataFromSignUpActivity2",c_pw)
                startActivity(intent)
                Toast.makeText(applicationContext, "회원가입 완료", Toast.LENGTH_SHORT).show()
            }

            else {
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}