package com.example.cpusviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cpusviewer.databinding.ActivityItemBinding
import com.example.cpusviewer.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cpu_item.view.ivCpu

class ItemActivity : AppCompatActivity() {
    lateinit var binding: ActivityItemBinding // binding variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemBinding.inflate(layoutInflater) // binding variable
        val view = binding.root // binding variable
        setContentView(view) // binding variable
        // get the data from the intent
        val id = intent.getIntExtra("id", 0)
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val image = intent.getStringExtra("image")
        // set the data to the views
        binding.tvItemName.text = name
        binding.tvItemDescription.text = description
        binding.tvItemId.text = id.toString()
        Picasso.get().load(image).into(binding.itemImage)
    }
}