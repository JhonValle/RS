package com.example.rs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Recomendaciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recomendaciones)
    }

    fun R1(view: View?) {
        val recomendacion1 = Intent(this@Recomendaciones, PesobajomuyGrave::class.java)
        startActivity(recomendacion1)
    }

    fun R2(view: View?) {
        val recomendacion2 = Intent(this@Recomendaciones, PesobajoGrave::class.java)
        startActivity(recomendacion2)
    }

    fun R3(view: View?) {
        val recomendacion3 = Intent(this@Recomendaciones, Pesobajo::class.java)
        startActivity(recomendacion3)
    }

    fun R4(view: View?) {
        val recomendacion4 = Intent(this@Recomendaciones, PesoNormal::class.java)
        startActivity(recomendacion4)
    }

    fun R5(view: View?) {
        val recomendacion5 = Intent(this@Recomendaciones, Sobrepeso::class.java)
        startActivity(recomendacion5)
    }

    fun R6(view: View?) {
        val recomendacion6 = Intent(this@Recomendaciones, ObesidadGrado1::class.java)
        startActivity(recomendacion6)
    }

    fun R7(view: View?) {
        val recomendacion7 = Intent(this@Recomendaciones, ObesidadGrado2::class.java)
        startActivity(recomendacion7)
    }

    fun R8(view: View?) {
        val recomendacion8 = Intent(this@Recomendaciones, ObesidadGrado3::class.java)
        startActivity(recomendacion8)
    }
}