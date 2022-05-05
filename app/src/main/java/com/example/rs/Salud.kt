package com.example.rs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Salud : AppCompatActivity() {
    var EtxtAltura: EditText? = null
    var EtxtPeso:EditText? = null
    var btnCalcular: Button? = null
    var btnLimpiar:android.widget.Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salud)
        EtxtAltura = findViewById<View>(R.id.txtAltura) as EditText
        EtxtPeso = findViewById<View>(R.id.txtPeso) as EditText
        btnCalcular = findViewById<View>(R.id.btnCalcular) as Button
        btnLimpiar = findViewById<View>(R.id.btnLimpiar) as Button
        btnLimpiar!!.setOnClickListener(View.OnClickListener { Limpiar() })
        btnCalcular!!.setOnClickListener { CalcularIMC() }
    }

    private fun Limpiar() {
        EtxtAltura!!.setText("")
        EtxtPeso!!.setText("")
    }

    private fun MensajeIMC(IMC: Double): String {
        var mensaje = ""
        if (IMC < 16)
            mensaje = "Peso bajo muy grave"


        else if (IMC > 40)
            mensaje = "Obesidad Grado III"
        return mensaje
    }

    private fun CalcularIMC() {
        val altura = java.lang.Double.valueOf(EtxtAltura!!.text.toString())
        val peso: Double = java.lang.Double.valueOf(EtxtPeso!!.getText().toString())
        val IMC = peso / Math.pow(altura, 2.0)
        Toast.makeText(
            this,
            "Tu IMC es" + String.format("%.2f", IMC) + MensajeIMC(IMC),
            Toast.LENGTH_SHORT
        ).show()
    }

    fun recomendacion(view: View?) {
        val recomendacion1 = Intent(this@Salud, Recomendaciones::class.java)
        startActivity(recomendacion1)
    }
}

