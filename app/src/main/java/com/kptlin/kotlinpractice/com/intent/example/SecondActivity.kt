package com.kptlin.kotlinpractice.com.intent.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kptlin.kotlinpractice.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle:Bundle = intent.extras
        val id = bundle.get("id_value")
        val name = bundle.get("name")
        Toast.makeText(applicationContext,id.toString()+" "+name,Toast.LENGTH_LONG).show()

        scndbtn2.setOnClickListener(){
            Toast.makeText(applicationContext," This Is Second Class ",Toast.LENGTH_SHORT).show()
        }

    }
}
