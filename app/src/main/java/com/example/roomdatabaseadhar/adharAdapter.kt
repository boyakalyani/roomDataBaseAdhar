package com.example.roomdatabaseadhar

import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adharAdapter :RecyclerView.Adapter<adharAdapter.adharViewHolder>(){
    private val list= mutableListOf<AdharEntity>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adharViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.activity_add_data,parent,false)
        return adharViewHolder(view)
    }

    override fun onBindViewHolder(holder: adharViewHolder, position: Int) {
        val AdharDetails=list[position]
        holder.tvNum.text=AdharDetails.adharNumber
        holder.tvName.text=AdharDetails.adharHolderName
        holder.tvDob.text=AdharDetails.adharDOB
        holder.tvAdres.text=AdharDetails.adharCity

    }
//    override fun getItemCount() = list.size
    override fun getItemCount(): Int {
        return list.size
    }
    class adharViewHolder (iterm:View):RecyclerView.ViewHolder(iterm){
        val tvNum:TextView=itemView.findViewById(R.id.adharNumber_id)
        val tvName:TextView=itemView.findViewById(R.id.adharNumber_id)
        val tvDob:TextView=itemView.findViewById(R.id.adharNumber_id)
        val tvAdres:TextView=itemView.findViewById(R.id.adharNumber_id)
    }
    fun setData(data:List<AdharEntity>) {
        list.apply {
            clear()
            addAll(data)
        }
    }
}