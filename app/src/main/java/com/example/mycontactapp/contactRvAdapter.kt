package com.example.mycontactapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import android.content.Context

class contactRvAdapter(var contactList: List<Contact>,var context: Context):RecyclerView.Adapter<contactRvAdapter.contactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list,parent,false)//when an item is clicked it does not register
        return contactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: contactViewHolder, position: Int) {
        var currentStudent=contactList.get(position)
        holder.tvName.text=currentStudent.name
        holder.tvEmail.text=currentStudent.email
        holder.tvPhone.text=currentStudent.phone
        Picasso.get()
            .load(currentStudent.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivImage)
        holder.cvContact.setOnClickListener{
            var intent=Intent(context,my_nextactivity::class.java)
            intent.putExtra("name",currentStudent.name)
            intent.putExtra("email",currentStudent.email)
            intent.putExtra("phone",currentStudent.phone)
            intent.putExtra("image",currentStudent.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)



        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class contactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhone=itemView.findViewById<TextView>(R.id.tvPhone)
        var ivImage=itemView.findViewById<ImageView>(R.id.ivImage)
        var cvContact=itemView.findViewById<CardView>(R.id.cvContact)
}}
























