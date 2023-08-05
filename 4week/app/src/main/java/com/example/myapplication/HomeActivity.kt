package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strData = intent.getStringExtra("dataFromSignInActivity")
        val v_id = findViewById<TextView>(R.id.View_id)
        v_id.setText(strData)

        val btn_finish = findViewById<Button>(R.id.btn_finish)
        btn_finish.setOnClickListener {
            finish()
        }
    }
}