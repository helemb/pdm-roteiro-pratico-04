package com.example.meuquartoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {

    private val TAG = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "onCreate - MainActivity2 - Helem")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - MainActivity2 - Helem")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume - MainActivity2 - Helem")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause - MainActivity2 - Helem")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - MainActivity2 - Helem")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - MainActivity2 - Helem")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart - MainActivity2 - Helem")
    }
}
