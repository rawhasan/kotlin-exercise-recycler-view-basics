package com.example.recyclerviewbasics.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexercise.R
import com.example.recyclerviewbasics.adapter.WordAdapter
import com.example.recyclerviewbasics.data.WordDatasource

class WordListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataset = WordDatasource().loadWords()

        val wordRecyclerView = view.findViewById<RecyclerView>(R.id.word_recycler_view)
        wordRecyclerView.adapter = WordAdapter(dataset)

        wordRecyclerView.setHasFixedSize(true)
    }
}