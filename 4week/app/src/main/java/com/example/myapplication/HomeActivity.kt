package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val Img = findViewById<ImageView>(R.id.imageView)
        val Image = when((1..5).random()){
            1 -> R.drawable.ddung_re_1
            2 -> R.drawable.ddung_re_2
            3 -> R.drawable.ddung_re_3
            4 -> R.drawable.ddung_re_4
            5 -> R.drawable.kakaotalk_20230804_174604716
            else -> R.drawable.kakaotalk_20230804_174604716
        }

        Img.setImageResource(Image)


        val strData = intent.getStringExtra("dataFromSignInActivity")
        val v_id = findViewById<TextView>(R.id.View_id)
        v_id.setText(strData)

        val btn_finish = findViewById<Button>(R.id.btn_finish)
        btn_finish.setOnClickListener {
            finish()
        }
    }
}