package com.kptlin.kotlinpractice.com.intent.example

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kptlin.kotlinpractice.R
import kotlinx.android.synthetic.main.activity_explicit_intent_ex.*
import kotlinx.android.synthetic.main.activity_implicit_intent_ex.*

class ExplicitIntentEx : AppCompatActivity() {
    var x:Int=10
    var name:String="Rajeev"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_ex)

        btnClick.setOnClickListener(){
            intent= Intent(applicationContext,SecondActivity::class.java)
            intent.putExtra("id_value",x)
            intent.putExtra("name",name)
            startActivity(intent)
        }

        gotoImplicit.setOnClickListener(){
            intent= Intent(applicationContext,ImplicitIntentEx::class.java)
            startActivity(intent)
        }

    }
}
