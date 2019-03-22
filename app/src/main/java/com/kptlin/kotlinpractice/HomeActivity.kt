package com.kptlin.kotlinpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var edtbtn=findViewById<Button>(R.id.etActtivity)
        var btn2=findViewById<Button>(R.id.toast2)

        edtbtn.setOnClickListener(){
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener(){
            intent= Intent(this,CustomToast::class.java)
            startActivity(intent)
        }
    }
}
