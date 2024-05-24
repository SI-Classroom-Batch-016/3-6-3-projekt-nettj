package com.joxoo.outtrac.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joxoo.outtrac.data.model.Employee
import com.joxoo.outtrac.databinding.EmployeeListItemBinding

class EmployeeListItemAdapter(
    private val dataset: List<Employee>,
    val itemClickedCallback: (Employee) -> Unit
): RecyclerView.Adapter<EmployeeListItemAdapter.ItemViewHolder>(){

    inner class ItemViewHolder(val binding: EmployeeListItemBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = EmployeeListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.nameTV.text = "${item.person.firstname} ${item.person.lastname}"
        holder.binding.workedHoursCPB.progressMax = item.workLogSummary.monthHours
        holder.binding.workedHoursCPB.progress = item.workLogSummary.workedMonthHours
        holder.binding.root.setOnClickListener {
            itemClickedCallback(item)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }


}