package com.example.internalpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_item.view.*

class FruitAdapter(val context:Context,var arr:ArrayList<Fruit>)
    :RecyclerView.Adapter<FruitAdapter.PersonViewHolder>()

{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var inflater= LayoutInflater.from(parent.context)
        var view= inflater.inflate(R.layout.card_item,parent,false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(arr[position])
    }

    override fun getItemCount(): Int {
        return  arr.size
    }

    class PersonViewHolder(var view: View):RecyclerView.ViewHolder(view)
    {
        fun bind(p:Fruit)
        {
            view.tvFrName.setText(p.fr_name)
            view.tvFrDesc.setText(p.fr_desc)
            view.tvFrPrice.setText(p.fr_price.toString())

        }
    }
}