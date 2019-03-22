package com.kptlin.kotlinpractice.com.intent.example

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kptlin.kotlinpractice.R
import kotlinx.android.synthetic.main.activity_implicit_intent_ex.*

class ImplicitIntentEx : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent_ex)

        implicitIntent.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://teachmeandroidhub.blogspot.com/"))
            startActivity(intent)
        }

    }
}
