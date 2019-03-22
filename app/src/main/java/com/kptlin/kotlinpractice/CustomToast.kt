package com.kptlin.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_custom_toast.*
import kotlinx.android.synthetic.main.customtoast.*

class CustomToast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast)
        val layout=layoutInflater.inflate(R.layout.customtoast,linearLayout)
        customtoastbtn.setOnClickListener(){

            var cToast=Toast(applicationContext)
            cToast.duration=Toast.LENGTH_LONG
            cToast.setGravity(Gravity.CENTER,0,0)
            cToast.view=layout
            cToast.show()
        }

    }
}
