package com.example.recyclerviewbasics.data

import com.example.recyclerviewexercise.R
import com.example.recyclerviewbasics.model.TextAffirmation

class TextDatasource {
    fun loadAffirmations(): List<TextAffirmation> {
        return listOf<TextAffirmation>(
            TextAffirmation(R.string.affirmation1),
            TextAffirmation(R.string.affirmation2),
            TextAffirmation(R.string.affirmation3),
            TextAffirmation(R.string.affirmation4),
            TextAffirmation(R.string.affirmation5),
            TextAffirmation(R.string.affirmation6),
            TextAffirmation(R.string.affirmation7),
            TextAffirmation(R.string.affirmation8),
            TextAffirmation(R.string.affirmation9),
            TextAffirmation(R.string.affirmation10)
        )
    }
}