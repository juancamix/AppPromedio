package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var campoTexto: EditText? = null
    var txtResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoTexto = findViewById(R.id.editText)
        txtResult = findViewById(R.id.textResult)

        var myBoton: Button = findViewById(R.id.botton1)
        myBoton.setOnClickListener{onClick( 1)}

        var myBoton2: Button = findViewById(R.id.button2)
        myBoton2.setOnClickListener {onClick( 2)}

        var myBoton3: Button = findViewById(R.id.button3)
        myBoton3.setOnClickListener { onClick( 3) }
    }

    private fun onClick(boton: Int) {
        when (boton){
            1-> {
            var nombre: String = campoTexto!!.text.toString()
            txtResult!!.text = "bienvenido $nombre"
        }
            2-> {
                var intent = Intent(this, ActivityMensaje::class.java)

                var miBundle: Bundle = Bundle()
                miBundle.putString("nombre", campoTexto!!.text.toString())
                intent.putExtras(miBundle)
                startActivity(intent)
            }
            3-> {
                var intent = Intent( this, activity_Math::class.java)
                startActivity(intent)
            }
        }
    }
}