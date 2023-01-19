package com.example.ejerciciomvcextendido.models.template

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.ejerciciomvcextendido.ListadoPersonas
import com.example.ejerciciomvcextendido.R

class FormularioPersona {
    lateinit var context: Context

    fun render (context: Context): ViewGroup{
        var intentListadoPersonas = Intent(context, ListadoPersonas::class.java)
        var inflate = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var viewGroup = inflate.inflate(R.layout.plantilla_formulariopersona, null) as ViewGroup

        //datos del formulario
        var nombre = viewGroup.findViewById(R.id.editTextTextPersonNombre) as EditText
        var email = viewGroup.findViewById(R.id.editTextTextPersonEmail) as EditText

        var buttonEnviar = viewGroup.findViewById(R.id.buttonEnviarFormulario) as Button
        buttonEnviar.setOnClickListener {
            if (nombre.text.toString().isNotEmpty() && email.text.toString().isNotEmpty()) {
                var intent = Intent(context, ListadoPersonas::class.java)
                intent.putExtra("nombre", nombre.text.toString())
                intent.putExtra("email", email.text.toString())
                context.startActivity(intentListadoPersonas)
                println("Enviando formulario")
            } else {
                println("No se puede enviar el formulario")
            }
        }
        return viewGroup

    }

}