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
            val NameData = name.text.toString()
            val IdData = c_id.text.toString()
            val PasswordData = c_pw.text.toString()

            if(NameData.isEmpty()){
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }

            else if(IdData.isEmpty()){
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }

            else if(PasswordData.isEmpty()){
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this,SignInActivity::class.java)
                intent.putExtra("dataFromSignUpActivity",IdData)
                intent.putExtra("dataFromSignUpActivity2",PasswordData)
                startActivity(intent)
                Toast.makeText(applicationContext, "회원가입 완료", Toast.LENGTH_SHORT).show()

            }
        }
    }
}