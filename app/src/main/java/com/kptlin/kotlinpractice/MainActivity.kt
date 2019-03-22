package com.kptlin.kotlinpractice

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
lateinit var et_text: EditText
lateinit var et_t: EditText
lateinit var btn:Button
lateinit var textview:TextView
lateinit var toastbtn:Button


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et_text=findViewById<EditText>(R.id.et1)
        et_t=findViewById<EditText>(R.id.et2)
        btn=findViewById<Button>(R.id.btn1)
        textview=findViewById<TextView>(R.id.print)
        toastbtn=findViewById<Button>(R.id.toast)
        btn.setOnClickListener() {
            val str1:String=et_text.text.toString()
            val str2:String=et_t.text.toString()
            if(str1.equals(null) || str1.trim()==""){
                Toast.makeText(this,"Please enter something in first box",Toast.LENGTH_SHORT).show()
            }else if (str2.equals(null) || str2.trim()==""){
                Toast.makeText(this,"Please enter something in Second box",Toast.LENGTH_SHORT).show()
            }else{
                textview.setText("$str1 and $str2").toString()
            }
        }
        toastbtn.setOnClickListener(){

            var toast2=Toast.makeText(applicationContext,"Hello  Guys again",Toast.LENGTH_LONG)
            toast2.setGravity(Gravity.RIGHT,270,610)
            toast2.show()
        }

    }

}
