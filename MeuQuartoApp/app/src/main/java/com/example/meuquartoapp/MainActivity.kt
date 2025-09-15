package com.example.meuquartoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate - MainActivity - Helem")

        val botao = findViewById<Button>(R.id.btnAbrirSegunda)
        botao.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - MainActivity - Helem")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume - MainActivity - Helem")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause - MainActivity - Helem")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - MainActivity - Helem")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - MainActivity - Helem")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart - MainActivity - Helem")
    }
}



