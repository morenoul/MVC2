package com.example.ejerciciomvcextendido.models.template

import android.content.Context
import android.view.ViewGroup
import com.example.ejerciciomvcextendido.R

class ListadoPersonasPlantilla {
    lateinit var context: Context
    fun render (context:Context, nombre:String, email:String): android.view.ViewGroup{
        var gestionpersona = android.content.Intent(context, com.example.ejerciciomvcextendido.MainActivity::class.java)
        var inflate = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as android.view.LayoutInflater
        var viewGroup = inflate.inflate(R.layout.plantilla_listadopersonas, null) as ViewGroup

        var textViewNombre = viewGroup.findViewById(R.id.nombreListadoPersonas) as android.widget.TextView
        var textViewEmail = viewGroup.findViewById(R.id.emailListadoPersonas) as android.widget.TextView
        var buttonVolver = viewGroup.findViewById(R.id.volverListado) as android.widget.Button

        textViewNombre.text = nombre
        textViewEmail.text = email
        buttonVolver.setOnClickListener {
            context.startActivity(gestionpersona)
        }
        return viewGroup
    }
}
