package com.example.a3sumandovalores

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.set

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var n1 = findViewById<EditText>(R.id.n1)
        var n2 = findViewById<EditText>(R.id.n2)
        var bt = findViewById<Button>(R.id.button)
        var re = findViewById<EditText>(R.id.showResultadoField)

        bt.setOnClickListener{
            var resultado = n1.text.toString().toInt() * n2.text.toString().toInt()
            Log.e("Sergio","${resultado}")
            re.setText(resultado.toString())

        }


    }







}