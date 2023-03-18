package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class activity_Math : AppCompatActivity() {

    var n1: EditText? = null
    var n2: EditText? = null
    var n3: EditText? = null
    var nameMaths: EditText? = null
    var materia: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)

         n1 = findViewById(R.id.note1)
         n2 = findViewById(R.id.note2)
         n3 = findViewById(R.id.note3)

        nameMaths = findViewById(R.id.nameMaths)
        materia = findViewById(R.id.materia)

        var btnResult1 : Button = findViewById(R.id.btnResult)
        btnResult1.setOnClickListener { result() }

        var botonSalir: Button = findViewById(R.id.botton_Math)
        botonSalir.setOnClickListener { finish() }
    }

    private fun result() {
        var intent = Intent(this, Activity_maths_result::class.java)
        //var txtResult: TextView = findViewById(R.id.Math_Result)


        var myNombre: Bundle = Bundle()
        myNombre.putString("nombre",nameMaths!!.text.toString())
        intent.putExtras((myNombre))

        var myMateria: Bundle = Bundle()
        myMateria.putString("materia",materia!!.text.toString())
        intent.putExtras((myMateria))


        var number1: Double = n1!!.text.toString().toDouble()
        var number2: Double = n2!!.text.toString().toDouble()
        var number3: Double = n3!!.text.toString().toDouble()

        var prom = (number1 + number2 + number3 ) / 3

        var txtMensaje = "Su promedio es de $prom"

        var myProm: Bundle = Bundle()
        myProm.putString("prom",txtMensaje!!.toString())
        intent.putExtras((myProm))

        startActivity(intent)

        //txtResult!!.text = "Hola, camilo tu promedio es de: $prom"
    }

}