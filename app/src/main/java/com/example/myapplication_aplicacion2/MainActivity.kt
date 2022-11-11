package com.example.myapplication_aplicacion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onClick(view: View) {
        var entradatext : EditText = findViewById(R.id.Txt)

        var texto: String = entradatext.text.toString()

        texto = texto

        Toast.makeText(this,"el mensaje es: "+ texto, Toast.LENGTH_LONG).show()
    }
}