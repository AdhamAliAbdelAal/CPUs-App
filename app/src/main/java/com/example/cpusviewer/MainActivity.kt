package com.example.cpusviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cpusviewer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // binding variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // binding variable
        val view = binding.root // binding variable
        setContentView(view) // binding variable

        val cpus = mutableListOf<CPUsItem>(
            CPUsItem(
                "this cpu is made by intel and is a 64 bit cpu",
                1,
                "https://t3.ftcdn.net/jpg/02/81/42/78/240_F_281427849_nRups6kcaGgVVWC5tF0qQks03qq7cxAF.jpg",
                "8068 CPU"),
            CPUsItem(
                "this cpu is made by AMD and is a 64 bit cpu",
                2,
                "https://t4.ftcdn.net/jpg/01/36/83/05/240_F_136830578_Uk1mQk9MGSHbOZpjiTnz7JxAOHKCwVKH.jpg",
                "AMD Ryzen 5 3600"),
            CPUsItem(
                "this cpu is made by Atmega and is a 32 bit cpu",
                3,
                "https://t4.ftcdn.net/jpg/01/09/59/81/240_F_109598141_hhHRriyaO2jIDUPbttE385zyEZUsrHbP.jpg",
                "Intel Core i9-9900K"),
        )
        val adaptor = CPUAdaptor(cpus)
        binding.rvCpus.adapter = adaptor
        binding.rvCpus.layoutManager = LinearLayoutManager(this)
    }

}