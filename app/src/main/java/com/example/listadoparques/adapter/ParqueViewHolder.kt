package com.example.listadoparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Parques
import com.example.listadoparques.databinding.ItemParquesBinding

class ParqueViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemParquesBinding.bind(view)
    fun render(parquesModel: Parques) {
        binding.Nombre.text = parquesModel.titulo
        binding.Descripcion.text = parquesModel.descripcion

        Glide.with(binding.Imagen.context).load(parquesModel.foto).into(binding.Imagen)

        //Imagen
        binding.Imagen.setOnClickListener{
            Toast.makeText(binding.Imagen.context, parquesModel.titulo,Toast.LENGTH_LONG).show()
        }

        //EVENTO HACER CLIC EN LA IMAGEN ENTERA
        itemView.setOnClickListener{
            Toast.makeText(binding.Imagen.context, parquesModel.titulo,Toast.LENGTH_LONG).show()
        }

    }
}