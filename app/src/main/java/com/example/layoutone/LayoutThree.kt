package com.example.layoutone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class LayoutThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_three)

    }


    fun next(view: View) {
        var firstname=findViewById<EditText>(R.id.firstname)
        var first:String=firstname.text.toString()

        var lastname=findViewById<EditText>(R.id.lastname)
        var last:String=lastname.text.toString()

        var email=findViewById<EditText>(R.id.email)
        var mail:String=email.text.toString()

        var phoneno=findViewById<EditText>(R.id.phoneno)
        var pno:String= phoneno.text.toString()


                if (first.isEmpty()) {firstname.error = "enter firstname"}
                if (last.isEmpty()) {lastname.error = "enter lastname"}
                if (mail.isEmpty()) {email.error = "enter email"}
                if (pno.isEmpty()) {phoneno.error = "enter mobileNo"}

        if(first.isNotEmpty() && (last.isNotEmpty()) && (mail.isNotEmpty()) && (pno.isNotEmpty())){
                var intent = Intent(this, LayoutFour::class.java)
                startActivity(intent)
        }


    }

}