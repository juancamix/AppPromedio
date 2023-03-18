package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        val campoMensaje = findViewById<TextView>(R.id.txtMensaje)

        var miBundle: Bundle? = this.intent.extras

        if (miBundle != null) {
            campoMensaje.text = "hola ${miBundle.getString("nombre")} bienvenido"
        }

        var BotonSalir: Button = findViewById(R.id.botton_Mensa)
        BotonSalir.setOnClickListener { finish() }
    }


}
