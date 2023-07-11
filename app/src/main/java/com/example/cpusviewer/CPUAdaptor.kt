package com.example.cpusviewer

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cpu_item.view.ivCpu
import kotlinx.android.synthetic.main.cpu_item.view.tvDescription
import kotlinx.android.synthetic.main.cpu_item.view.tvName
import java.net.URL

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
            tvName.text=cpus[position].name
            val url = "https://t4.ftcdn.net/jpg/01/36/83/05/240_F_136830578_Uk1mQk9MGSHbOZpjiTnz7JxAOHKCwVKH.jpg"
            Picasso.get().load(url).into(ivCpu)
        }
    }
}