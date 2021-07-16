package com.example.mycontactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewContact()
    }
    fun viewContact(){
        var contact_list= listOf<Contact>(
            Contact("Happy Ayoma","ayoma@gmail.com","0936271917","https://images.unsplash.com/photo-1626275418623-0df0f07ce59c?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwzMXx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("Clarris khamala","clarris@gmail.com","0273647891","https://images.unsplash.com/photo-1626193770670-7153d4034137?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwzNHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("Olga Akello","akello@gmail.com","327374882","https://images.unsplash.com/photo-1539571696357-5a69c17a67c6?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8cGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("sophie robert","sophie@gmail.com","973678828","https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("Gladwell mwema","gladwell@gmail.com","0987654321","https://images.unsplash.com/photo-1534528741775-53994a69daeb?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60")

        )
        rvContact=findViewById(R.id.rvContacts)
        var studentAdapter=contactRvAdapter(contact_list,baseContext)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=studentAdapter

    }}
