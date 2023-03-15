package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Venue(
    val id: Int,
    val name: String,
    val city: String
): Parcelable
