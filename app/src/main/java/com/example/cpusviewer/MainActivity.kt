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

        val cpus = mutableListOf(
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                1,
                "https://picsum.photos/200?random=1",
                "8068 CPU"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                2,
                "https://picsum.photos/200?random=2",
                "AMD Ryzen 5 3600"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 32-bit CPU.",
                3,
                "https://picsum.photos/200?random=3",
                "Intel Core i9-9900K"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                4,
                "https://picsum.photos/200?random=4",
                "AMD Ryzen 7 5800X"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                5,
                "https://picsum.photos/200?random=5",
                "Intel Core i7-11700K"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                6,
                "https://picsum.photos/200?random=6",
                "AMD Ryzen 9 5950X"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                7,
                "https://picsum.photos/200?random=7",
                "Intel Core i5-11600K"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                8,
                "https://picsum.photos/200?random=8",
                "AMD Ryzen 3 3300X"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                9,
                "https://picsum.photos/200?random=9",
                "Intel Core i3-10100"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                10,
                "https://picsum.photos/200?random=10",
                "AMD Ryzen 5 5600X"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                11,
                "https://picsum.photos/200?random=11",
                "Intel Core i9-11900K"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                12,
                "https://picsum.photos/200?random=12",
                "AMD Ryzen 9 5900X"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                13,
                "https://picsum.photos/200?random=13",
                "Intel Core i7-10700K"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                14,
                "https://picsum.photos/200?random=14",
                "AMD Ryzen 7 3800XT"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                15,
                "https://picsum.photos/200?random=15",
                "Intel Core i5-11400F"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                16,
                "https://picsum.photos/200?random=16",
                "AMD Ryzen 5 3500X"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                17,
                "https://picsum.photos/200?random=17",
                "Intel Core i3-9100F"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                18,
                "https://picsum.photos/200?random=18",
                "AMD Ryzen 3 3100"
            ),
            CPUsItem(
                "This CPU is made by Intel and is a 64-bit CPU.",
                19,
                "https://picsum.photos/200?random=19",
                "Intel Core i9-10900K"
            ),
            CPUsItem(
                "This CPU is made by AMD and is a 64-bit CPU.",
                20,
                "https://picsum.photos/200?random=20",
                "AMD Ryzen 9 3900XT"
            )
        )

        val adaptor = CPUAdaptor(cpus)
        binding.rvCpus.adapter = adaptor
        binding.rvCpus.layoutManager = LinearLayoutManager(this)
    }

}