package com.kptlin.kotlinpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.kptlin.kotlinpractice.AlertDialog.AltDialogExample
import com.kptlin.kotlinpractice.ListViewExample.ListViewActivity
import com.kptlin.kotlinpractice.com.intent.example.ExplicitIntentEx
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_list_view.*

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
        btnIntent.setOnClickListener(){
            intent=Intent(applicationContext,ExplicitIntentEx::class.java)
            startActivity(intent)

        }
        list.setOnClickListener {
            intent=Intent(applicationContext,ListViewActivity::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener(){
            intent= Intent(applicationContext,AltDialogExample::class.java)
            startActivity(intent)
        }
    }
}
