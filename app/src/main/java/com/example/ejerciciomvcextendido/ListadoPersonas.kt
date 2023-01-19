package com.example.ejerciciomvcextendido

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciomvcextendido.models.template.ListadoPersonasPlantilla

class ListadoPersonas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            var listadoPersonasPlantilla = ListadoPersonasPlantilla()

            println(intent.extras)
        listadoPersonasPlantilla.context = this

        setContentView(listadoPersonasPlantilla.render(this, intent.getStringExtra("nombre").toString(), intent.getStringExtra("email").toString()))
    }
}