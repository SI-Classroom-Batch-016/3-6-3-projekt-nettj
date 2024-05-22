package com.joxoo.outtrac.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joxoo.outtrac.databinding.FragmentObjectBinding

class ObjectItemAdapter(): RecyclerView.Adapter<ObjectItemAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(val binding: FragmentObjectBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = FragmentObjectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.root.setOnClickListener {


        }
    }

}