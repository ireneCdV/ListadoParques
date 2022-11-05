package com.example.listadoparques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Parques
import com.example.listadoparques.R

class ParquesAdapter( private val ParquesList:List<Parques>):RecyclerView.Adapter<ParqueViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ParqueViewHolder(layoutInflater.inflate(R.layout.item_parques, parent,false))

    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = ParquesList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int {
        return ParquesList.size
    }

}