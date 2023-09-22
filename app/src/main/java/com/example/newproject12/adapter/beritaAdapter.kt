package com.example.newproject12.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newproject12.R
import com.example.newproject12.data.berita
import com.example.newproject12.data.komentar

class beritaAdapter (private val list: ArrayList<berita>)
    : RecyclerView.Adapter<beritaAdapter.beritaViewHolder>(){

        class beritaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            private val judulberita = itemView.findViewById<TextView>(R.id.judulberita)
            private val gambarberita = itemView.findViewById<ImageView>(R.id.gambarberita)
            private val descberita = itemView.findViewById<TextView>(R.id.descberita)

            fun bind(get: berita){
                judulberita.text = get.judul
                //gambarberita.setImageResource()
                descberita.text = get.desc

                judulberita.setOnClickListener {

                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): beritaViewHolder {
        return beritaViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.list_berita, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: beritaViewHolder, position: Int) {
        holder.bind(list[position])
    }
}