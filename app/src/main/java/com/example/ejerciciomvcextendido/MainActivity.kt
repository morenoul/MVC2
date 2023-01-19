package com.example.ejerciciomvcextendido

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciomvcextendido.models.template.FormularioPersona

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var formularioPersona = FormularioPersona()
        formularioPersona.context = this
        setContentView(formularioPersona.render(this))
    }
}