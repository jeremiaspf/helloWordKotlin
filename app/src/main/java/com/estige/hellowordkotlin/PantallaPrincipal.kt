package com.estige.hellowordkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pantalla_principal.*

class PantallaPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        btnSaludar.setOnClickListener {

            Toast.makeText(this, "Hola ${txtName.text}, eres un briboncete", Toast.LENGTH_LONG).show()

        }

        btnSiguiente.setOnClickListener {
            val nombre: String = txtName.text.toString()

            val intent: Intent = Intent(this, SegundaPantalla::class.java)
            intent.putExtra("strNombre",nombre)
            startActivity(intent)
            finish()
        }

    }
}
