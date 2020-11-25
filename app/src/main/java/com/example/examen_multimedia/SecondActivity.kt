package com.example.examen_multimedia

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TAG_SECOND_1 = "TAG_SECOND_1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        var textoObtenido = intent.getStringExtra(TAG_SECOND_1)
        var conversionLista = mutableListOf("")

        var textoMostrar = ""

        textoObtenido?.let {
            conversionLista = textoObtenido.split(" ").toMutableList()
            conversionLista?.forEach {
                textoMostrar += it + "\n"
            }
            tv_second.text = textoMostrar

        }

        bt_second_1.setOnClickListener {
            textoMostrar = ""
            conversionLista?.forEach {
                textoMostrar += it + " " + it.length + "\n"
            }
            tv_second.text = textoMostrar
        }

        bt_second_2.setOnClickListener {
            textoMostrar = ""
            conversionLista.sortedBy{ T -> T.length }?.forEach {
                textoMostrar += it+"\n"
            }
            tv_second.text = textoMostrar
        }

        bt_second_3.setOnClickListener {
            textoMostrar = ""
            if (!et_second_number.text.isNullOrEmpty()) {
                val filtro = conversionLista.asSequence()
                    .filter { it.length > et_second_number.text.toString().toInt() }

                filtro.forEach {
                    textoMostrar += it + "\n"
                }
                tv_second.text = textoMostrar.toString()
            }else{
                Toast.makeText(this,"parece que no has metido ningun numero" +
                        " querias pillarme eee....",Toast.LENGTH_LONG).show()
            }
        }
    }

}