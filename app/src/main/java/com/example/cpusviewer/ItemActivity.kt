package com.example.cpusviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.net.toUri
import com.example.cpusviewer.databinding.ActivityItemBinding

import com.squareup.picasso.Picasso


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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_cpu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        if(item.itemId == R.id.btnShare){
            return sendMessage()
        }
        else if(item.itemId==R.id.btnYoutube)
        {
            return openYoutube()
        }
        return super.onOptionsItemSelected(item)
    }

    fun openYoutube (): Boolean {
        val intent = Intent(Intent.ACTION_VIEW, "https://www.youtube.com".toUri())
        startActivity(intent)
        return true
    }

    fun sendMessage(): Boolean {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_EMAIL, "adhamali20012015@gmail.com")
        intent.putExtra(Intent.EXTRA_TEXT, "How are you?")
        startActivity(intent)
        return true
    }

}