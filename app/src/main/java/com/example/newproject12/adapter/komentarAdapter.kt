package com.example.newproject12.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newproject12.R
import com.example.newproject12.data.komentar

class komentarAdapter (private val list: ArrayList<komentar>)
    : RecyclerView.Adapter<komentarAdapter.komentarViewHolder>(){

    class komentarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val username = itemView.findViewById<TextView>(R.id.username)
        private val komentar = itemView.findViewById<TextView>(R.id.komentar)

        fun bind(get: komentar){
            username.text = get.username
            komentar.text = get.komentar
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): komentarViewHolder {
       return komentarViewHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.list_komentar,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: komentarViewHolder, position: Int) {
        holder.bind(list[position])
    }
}