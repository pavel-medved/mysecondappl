package com.example.mysecondappl


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondappl.databinding.ActivityMapsBinding


class MapsActivity:AppCompatActivity() {
    private lateinit var binding:ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}