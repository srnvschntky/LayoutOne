package com.example.layoutone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Active : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active)
    }
    fun login(view: View){
        var username=findViewById<EditText>(R.id.username)
        var user=username.text.toString()
        var password=findViewById<EditText>(R.id.password)
        var pass=password.text.toString()
        if(user.isEmpty()) username.error="enter UserName"
        if(pass.isEmpty()) password.error="enter password"
        if(user.isNotEmpty() && pass.isNotEmpty()){
            var intent= Intent(this,LayoutTwo::class.java)
            startActivity(intent)
        }
    }

    fun register(view: View) {
        var intent= Intent(this,LayoutThree::class.java)
        startActivity(intent)
    }

}