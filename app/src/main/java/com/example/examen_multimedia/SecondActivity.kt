package com.example.examen_multimedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {
    companion object{
        const val TAG_SECOND_1 = "TAG_SECOND_1"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        var textoObtenido = intent.getStringExtra(TAG_SECOND_1)
        var conversionLista = mutableListOf("")

        var textoMostrar = ""

        textoObtenido?.run {
            conversionLista = textoObtenido.split(" ").toMutableList()

            conversionLista?.forEach{
                textoMostrar += it+"\n"
            }
            tv_second.text = textoMostrar
        }

        bt_second_1.setOnClickListener{
            textoMostrar = ""
            conversionLista?.forEach{
                textoMostrar += it+" "+it.length+"\n"
            }
            tv_second.text = textoMostrar
        }
        bt_second_2.setOnClickListener{

        }

        bt_second_3.setOnClickListener{
            var filtro = conversionLista.asSequence().filter{ it.length > et_second_number.text.toString().toInt()}
            textoMostrar = ""
            et_second_number?.run{
                filtro?.forEach {
                    textoMostrar += it+"\n"
                }
                tv_second.text = textoMostrar.toString()
            }
        }
    }


}