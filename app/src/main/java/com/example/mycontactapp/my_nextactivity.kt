package com.example.mycontactapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class my_nextactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_nextactivity)

        var nameintent=intent.getStringExtra("name")
        var emailintent=intent.getStringExtra("email")
        var phoneintent=intent.getStringExtra("phone")
        var imageintent=intent.getStringExtra("imageUrl").toString()

        var name=findViewById<TextView>(R.id.tvName2)
        var email=findViewById<TextView>(R.id.tvEmail2)
        var phone=findViewById<TextView>(R.id.tvPhone2)
        var image=findViewById<ImageView>(R.id.ivperson)


        name.text=nameintent
        email.text=emailintent
        phone.text=phoneintent
        Picasso.get().load(imageintent).into(image)


    }
}