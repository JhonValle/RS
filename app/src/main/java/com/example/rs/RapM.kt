package com.example.rs

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RapM : AppCompatActivity() {
    var play_pause: Button? = null
    var btn_repetir:android.widget.Button? = null
    var mp: MediaPlayer? = null
    var iv: ImageView? = null
    var repetir = 2
    var posicion:kotlin.Int = 0

    var vectormp = arrayOfNulls<MediaPlayer>(5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rap_m)
        play_pause = findViewById<View>(R.id.btnPlay) as Button
        btn_repetir = findViewById<View>(R.id.btnRepetir) as Button
        iv = findViewById<View>(R.id.imageView) as ImageView
        vectormp[0] = MediaPlayer.create(this, R.raw.paseloquepase)
        vectormp[1] = MediaPlayer.create(this, R.raw.dragonb)
        vectormp[2] = MediaPlayer.create(this, R.raw.jokerrap)
        vectormp[3] = MediaPlayer.create(this, R.raw.santaflow)
        vectormp[4] = MediaPlayer.create(this, R.raw.superbroly)
    }

    fun PlayPause(view: View?) {
        if (vectormp[posicion]!!.isPlaying) {
            vectormp[posicion]!!.pause()
            play_pause!!.setBackgroundResource(R.drawable.reproducir)
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show()
        } else {
            vectormp[posicion]!!.start()
            play_pause!!.setBackgroundResource(R.drawable.reproducir)
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show()
        }
    }

    fun Stop(view: View?) {
        if (vectormp[posicion] != null) {
            vectormp[posicion]!!.stop()
            vectormp[0] = MediaPlayer.create(this, R.raw.paseloquepase)
            vectormp[1] = MediaPlayer.create(this, R.raw.dragonb)
            vectormp[2] = MediaPlayer.create(this, R.raw.jokerrap)
            vectormp[3] = MediaPlayer.create(this, R.raw.santaflow)
            vectormp[4] = MediaPlayer.create(this, R.raw.superbroly)
            posicion = 0
            play_pause!!.setBackgroundResource(R.drawable.reproducir)
            iv!!.setImageResource(R.drawable.pase)
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show()
        }
    }

    fun Repetir(view: View?) {
        if (repetir == 1) {
            btn_repetir!!.setBackgroundResource(R.drawable.no_repetir)
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show()
            vectormp[posicion]!!.isLooping = false
        } else {
            btn_repetir!!.setBackgroundResource(R.drawable.repetir)
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show()
            vectormp[posicion]!!.isLooping = true
            repetir = 1
        }
    }

    fun Siguiente(view: View?) {
        if (posicion < vectormp.size - 1) {
            if (vectormp[posicion]!!.isPlaying) {
                vectormp[posicion]!!.stop()
                posicion++
                vectormp[posicion]!!.start()
                if (posicion == 0) {
                    iv!!.setImageResource(R.drawable.pase)
                } else if (posicion == 1) {
                    iv!!.setImageResource(R.drawable.dragon1)
                } else if (posicion == 2) {
                    iv!!.setImageResource(R.drawable.joker)
                } else if (posicion == 3) {
                    iv!!.setImageResource(R.drawable.santaflow)
                } else if (posicion == 4) {
                    iv!!.setImageResource(R.drawable.dragon2)
                }
            } else {
                posicion++
                if (posicion == 0) {
                    iv!!.setImageResource(R.drawable.pase)
                } else if (posicion == 1) {
                    iv!!.setImageResource(R.drawable.dragon1)
                } else if (posicion == 2) {
                    iv!!.setImageResource(R.drawable.joker)
                } else if (posicion == 3) {
                    iv!!.setImageResource(R.drawable.santaflow)
                } else if (posicion == 4) {
                    iv!!.setImageResource(R.drawable.dragon2)
                }
            }
        } else {
            Toast.makeText(this, "No existe mas canciones", Toast.LENGTH_SHORT).show()
        }
    }

    fun Anterior(view: View?) {
        if (posicion >= 1) {
            if (vectormp[posicion]!!.isPlaying) {
                vectormp[posicion]!!.stop()
                vectormp[0] = MediaPlayer.create(this, R.raw.paseloquepase)
                vectormp[1] = MediaPlayer.create(this, R.raw.dragonb)
                vectormp[2] = MediaPlayer.create(this, R.raw.jokerrap)
                vectormp[3] = MediaPlayer.create(this, R.raw.santaflow)
                vectormp[4] = MediaPlayer.create(this, R.raw.superbroly)
                posicion--
                if (posicion == 0) {
                    iv!!.setImageResource(R.drawable.pase)
                } else if (posicion == 1) {
                    iv!!.setImageResource(R.drawable.dragon1)
                } else if (posicion == 2) {
                    iv!!.setImageResource(R.drawable.joker)
                } else if (posicion == 3) {
                    iv!!.setImageResource(R.drawable.santaflow)
                } else if (posicion == 4) {
                    iv!!.setImageResource(R.drawable.dragon2)
                }
                vectormp[posicion]!!.start()
            } else {
                posicion--
                if (posicion == 0) {
                    iv!!.setImageResource(R.drawable.pase)
                } else if (posicion == 1) {
                    iv!!.setImageResource(R.drawable.dragon1)
                } else if (posicion == 2) {
                    iv!!.setImageResource(R.drawable.joker)
                } else if (posicion == 3) {
                    iv!!.setImageResource(R.drawable.santaflow)
                } else if (posicion == 4) {
                    iv!!.setImageResource(R.drawable.dragon2)
                }
            }
        } else {
            Toast.makeText(this, "No existe mas canciones", Toast.LENGTH_SHORT).show()
        }
    }
}