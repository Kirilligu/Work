package com.example.work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View) {
        val etA = findViewById<EditText>(R.id.numA)
        val etB = findViewById<EditText>(R.id.numB)
        val tvSum = findViewById<TextView>(R.id.sum)

        val strA = etA.text.toString()
        val strB = etB.text.toString()
        if (strA.isEmpty() || strB.isEmpty()) {
            tvSum.text = "Заполните все поля"
            return
        }
        val numA = strA.toDoubleOrNull()
        val numB = strB.toDoubleOrNull()
        if (numA == null || numB == null) {
            tvSum.text = "Введите корректные значения"
            return
        }
        val sum = numA + numB
        tvSum.text = sum.toString()
    }
}
