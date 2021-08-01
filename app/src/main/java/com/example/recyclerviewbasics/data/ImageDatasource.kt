package com.example.recyclerviewbasics.data

import com.example.recyclerviewbasics.model.ImageAffirmation
import com.example.recyclerviewexercise.R
import com.example.recyclerviewbasics.model.TextAffirmation

class ImageDatasource {
    fun loadImageAffirmations(): List<ImageAffirmation> {
        return listOf<ImageAffirmation>(
            ImageAffirmation(R.string.affirmation1, R.drawable.image1),
            ImageAffirmation(R.string.affirmation2, R.drawable.image2),
            ImageAffirmation(R.string.affirmation3, R.drawable.image3),
            ImageAffirmation(R.string.affirmation4, R.drawable.image4),
            ImageAffirmation(R.string.affirmation5, R.drawable.image5),
            ImageAffirmation(R.string.affirmation6, R.drawable.image6),
            ImageAffirmation(R.string.affirmation7, R.drawable.image7),
            ImageAffirmation(R.string.affirmation8, R.drawable.image8),
            ImageAffirmation(R.string.affirmation9, R.drawable.image9),
            ImageAffirmation(R.string.affirmation10, R.drawable.image10)
        )
    }
}