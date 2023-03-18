package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity_maths_result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_result)

        var campotxt = findViewById<TextView>(R.id.campotxt1)


        var myProm: Bundle? = this.intent.extras
        var myNombre: Bundle? = this.intent.extras
        var myMateria: Bundle? = this.intent.extras


            campotxt.text = "hola ${myNombre!!.getString("nombre")}\n la materia es: ${myMateria!!.getString("materia")}\n tu promedio es de: ${myProm!!.getString("prom")}"


        var botonSalir: Button = findViewById(R.id.btnSalir2)
        botonSalir.setOnClickListener { finish() }
    }
}