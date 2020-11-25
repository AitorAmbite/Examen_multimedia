package com.example.examen_multimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val second_activity = Intent(this,SecondActivity::class.java)
        et_activity_1.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                var lista = et_activity_1.text.split(" ")
                if(lista.size >= 4){
                    bt_lanzar_second.isEnabled = true;
                }
            }

        })
        bt_lanzar_second.setOnClickListener{
            second_activity.putExtra(SecondActivity.TAG_SECOND_1,et_activity_1.text.toString())
            startActivity(second_activity)
        }
    }
}