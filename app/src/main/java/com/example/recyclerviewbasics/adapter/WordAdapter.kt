package com.example.recyclerviewbasics.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexercise.R

class WordAdapter(
    private val dataset: List<String>
) : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    class WordViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.word_item_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.word_list_item, parent, false) // Bug fixed: inflating wrong layout

        return WordViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val item = dataset[position]

        holder.textView.text = item
    }

    override fun getItemCount() = dataset.size
}