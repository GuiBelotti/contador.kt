package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCounter: TextView = findViewById(R.id.txtCounter)
        val btnIncrement: Button = findViewById(R.id.botaoIncrementar)
        val btnDecrement: Button = findViewById(R.id.botaoDecrementar)

        btnIncrement.setOnClickListener {
            contador++
            txtCounter.text = contador.toString()
        }

        btnDecrement.setOnClickListener {
            if (contador > 0) {
                contador--
                txtCounter.text = contador.toString()
            }
        }
    }
}