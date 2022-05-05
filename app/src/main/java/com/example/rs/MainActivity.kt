package com.example.rs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var audio: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        audio = findViewById(R.id.audio)

        audio!!.setOnClickListener(View.OnClickListener { LlamarAudio() })
    }


    private fun LlamarAudio() {
        val intent = Intent(this@MainActivity, Botones::class.java)
        startActivity(intent)
    }
    fun Operacion(view: View?) {
        val operaciones = Intent(this@MainActivity, Operaciones::class.java)
        startActivity(operaciones)
    }

    fun salud1(view: View?) {
        val salud1 = Intent(this@MainActivity, Salud::class.java)
        startActivity(salud1)
    }
    fun cronometro (view: View?) {
        val cronometro = Intent(this@MainActivity, Cronometro::class.java)
        startActivity(cronometro)
    }

    fun salir(view: View?) {
        finish()
    }
}