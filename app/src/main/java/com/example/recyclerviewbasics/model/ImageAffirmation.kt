package com.example.recyclerviewbasics.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Resource annotations show warnings if wrong type of resource id is provides
// (String Resource Id instead of Drawable Resource Id
data class ImageAffirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)