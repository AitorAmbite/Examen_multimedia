package com.example.examen_multimedia

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {
    companion object{
        const val TAG_SECOND_1 = "TAG_SECOND_1"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        var texto = intent.getStringExtra(TAG_SECOND_1)
        var conversionLista = mutableListOf("")
        var textoMostrar = ""

        texto?.run {
            conversionLista = texto.split(" ").toMutableList()
            conversionLista?.forEach{
                textoMostrar += it+"\n"
            }
            tv_second.text = textoMostrar
        }
//        et_second_number.addTextChangedListener(object  : TextWatcher{
//            override fun afterTextChanged(s: Editable?) {
//                TODO("Not yet implemented")
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                var eleccion = et_second_number.text.toString().toInt()
//                if(eleccion > 0){
//                    et
//                }
//            }
//
//        })

        bt_second_1.setOnClickListener{
            textoMostrar = ""
            conversionLista?.forEach{
                textoMostrar += it+" "+it.length+"\n"
            }
            tv_second.text = textoMostrar
        }
        bt_second_2.setOnClickListener{

        }
    }

}