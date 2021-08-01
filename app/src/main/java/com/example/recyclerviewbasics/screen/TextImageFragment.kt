package com.example.recyclerviewbasics.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbasics.adapter.ImageAdapter
import com.example.recyclerviewbasics.data.ImageDatasource
import com.example.recyclerviewexercise.R

class TextImageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text_image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataSource = ImageDatasource().loadImageAffirmations()

        val imageRecyclerView: RecyclerView = view.findViewById(R.id.image_recycler_view)
        imageRecyclerView.adapter = ImageAdapter(view.context, dataSource)

        imageRecyclerView.setHasFixedSize(true)
    }
}