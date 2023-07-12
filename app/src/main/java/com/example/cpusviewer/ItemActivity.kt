package com.example.cpusviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.net.toUri
import com.example.cpusviewer.databinding.ActivityItemBinding
import com.example.cpusviewer.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_item.btnOpenApp
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
        val btnOpenApp=binding.btnOpenApp
        btnOpenApp.setOnClickListener {
            // open youtube app
            // the first parameter is the action
            // action view means that we want to view something
            val intent = Intent(Intent.ACTION_VIEW, "https://www.youtube.com".toUri())
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_cpu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}