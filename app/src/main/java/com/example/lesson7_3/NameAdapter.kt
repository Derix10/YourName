package com.example.lesson7_3

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson7_3.databinding.FragmentBlankBinding
import com.example.lesson7_3.databinding.ItemNameBinding

class NameAdapter(private val data: ArrayList<Human>, val listener: OnClickNameListener) : RecyclerView.Adapter<NameAdapter.NameHolder>(){


    inner class NameHolder(private val binding: ItemNameBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(human:Human,listener: OnClickNameListener){
            itemView.setOnClickListener(){
                listener.onNameClick(human)
            }
            val item = data[adapterPosition]
            binding.age.text = item.age.toString()
            binding.tvName.text = item.name
            binding.tvSurname.text = item.surname
        }
    }
    interface OnClickNameListener{
        fun onNameClick(man:Human)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameHolder {
        return NameHolder(ItemNameBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NameHolder, position: Int) {
        holder.bind(data[position], listener)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}