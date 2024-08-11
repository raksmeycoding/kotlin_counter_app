package com.raksmey.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val welcomeTextView: TextView? = null
    private var counterText: TextView? = null
    private var btnClick: Button? = null
    private var counterNumber: Int = 0


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnClick = findViewById(R.id.btn_counter)
        counterText = findViewById(R.id.counter_text_view_id)


        btnClick?.setOnClickListener {
            counterText?.text = increaseCount().toString()

        }
    }


    private fun increaseCount(): Int {
        return ++counterNumber
    }
}