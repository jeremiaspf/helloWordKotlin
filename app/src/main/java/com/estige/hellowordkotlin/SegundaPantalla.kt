package com.estige.hellowordkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda_pantalla.*

class SegundaPantalla : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        val objIntentRec: Intent = intent
        val nombre = objIntentRec.getStringExtra("strNombre")
        txtMensaje.text = nombre
    }
}
