package com.example.recyclerviewbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import com.example.recyclerviewexercise.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)

        val textButton: Button = findViewById(R.id.text_list_button)
        textButton.setOnClickListener {
            navController.navigate(R.id.textListFragment)
        }

        val textImageButton: Button = findViewById(R.id.text_image_list_button)
        textImageButton.setOnClickListener {
            navController.navigate(R.id.textImageFragment)
        }

        val wordButton: Button = findViewById(R.id.word_list_button)
        wordButton.setOnClickListener {
            navController.navigate(R.id.wordListFragment)
        }
    }
}