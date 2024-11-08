package com.example.submission_pulung

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    val name: String,
    val position: String,
    val imageUrl: Int,
    val bio: String
) : Parcelable
