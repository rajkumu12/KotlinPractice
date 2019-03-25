package com.kptlin.kotlinpractice.AlertDialog

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.kptlin.kotlinpractice.R
import kotlinx.android.synthetic.main.activity_alt_dialog_example.*

class AltDialogExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alt_dialog_example)

        alertbtn.setOnClickListener(){
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Delete")
            builder.setMessage("Are You Sure?")
            builder.setIcon(R.drawable.teachmelogo)
            builder.setPositiveButton("Yes"){DialogInterface,which ->
                Toast.makeText(applicationContext,"Clicked Yes",Toast.LENGTH_SHORT).show()

            }
            builder.setNeutralButton("Cancel"){DialogInterface,which ->
                Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()

            }
            builder.setNegativeButton("No"){ DialogInterface,which ->
                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()

            }

            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}
