package com.example.rs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Botones : AppCompatActivity() {
    var RapG: Button? = null
    var PopG: Button? = null
    var ReggaetonG: Button? = null
    var RockG: Button? = null
    var CumbiaG: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)
        RapG = findViewById<View>(R.id.btnRap) as Button
        PopG = findViewById<View>(R.id.btnPop) as Button
        ReggaetonG = findViewById<View>(R.id.btnReggaeton) as Button
        RockG = findViewById<View>(R.id.btnRock) as Button
        CumbiaG = findViewById<View>(R.id.btnCumbia) as Button


        RapG!!.setOnClickListener { LlamarMusicRap() }

        PopG!!.setOnClickListener { LlamarMusicPop() }

        ReggaetonG!!.setOnClickListener { LlamarMusicReggaeton() }

        RockG!!.setOnClickListener { LlamarMusicRock() }

        CumbiaG!!.setOnClickListener { LlamarMusicCumbia() }

    }

    private fun LlamarMusicRap() {
        val intent1 = Intent(this@Botones, RapM::class.java)
        startActivity(intent1)
    }

    private fun LlamarMusicPop() {
        val intent2 = Intent(this@Botones, PopM::class.java)
        startActivity(intent2)
    }

    private fun LlamarMusicReggaeton() {
        val intent3 = Intent(this@Botones, ReggaetonM::class.java)
        startActivity(intent3)
    }

    private fun LlamarMusicRock() {
        val intent4 = Intent(this@Botones, RockM::class.java)
        startActivity(intent4)
    }

    private fun LlamarMusicCumbia() {
        val intent5 = Intent(this@Botones, CumbiaM::class.java)
        startActivity(intent5)
    }

}