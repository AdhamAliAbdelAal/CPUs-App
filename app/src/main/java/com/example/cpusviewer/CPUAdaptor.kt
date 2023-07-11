package com.example.cpusviewer

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cpu_item.view.ivCpu
import kotlinx.android.synthetic.main.cpu_item.view.tvDescription
import kotlinx.android.synthetic.main.cpu_item.view.tvItemName

class CPUAdaptor(private val cpus:List<CPUsItem>): RecyclerView.Adapter<CPUAdaptor.CPUViewHolder>(){
    inner class CPUViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CPUViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cpu_item, parent, false)
        return CPUViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cpus.size
    }

    override fun onBindViewHolder(holder: CPUViewHolder, position: Int) {
        holder.itemView.apply {
            tvDescription.text=cpus[position].description
            tvItemName.text=cpus[position].name
            val url = cpus[position].image
            Picasso.get().load(url).into(ivCpu)
        }
        // set on click listener for the item
        holder.itemView.setOnClickListener {
            // navigate to the item activity
            // pass the id of the item to the item activity
            val id = cpus[position].id
            val intent =  Intent(holder.itemView.context, ItemActivity::class.java)
            intent.putExtra("id", id)
            intent.putExtra("name", cpus[position].name)
            intent.putExtra("description", cpus[position].description)
            intent.putExtra("image", cpus[position].image)
            holder.itemView.context.startActivity(intent)
        }
    }
}