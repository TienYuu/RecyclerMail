package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val newList : ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,null)
        return MyViewHolder(itemView)

    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val current = newList[position]
        holder.imageView.setImageResource(current.imageId)
        holder.lastMsg.text = current.lastMsg
        holder.lastMsgTime.text = current.lastMsgTime
        holder.userName.text = current.name
    }
    override fun getItemCount(): Int {
        return newList.size
    }
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {


        val imageView : ImageView = itemView.findViewById(R.id.profilePic)
        val userName : TextView = itemView.findViewById(R.id.name)
        val lastMsg : TextView = itemView.findViewById(R.id.lastMsg)
        val lastMsgTime: TextView = itemView.findViewById(R.id.msgTime)

    }
}