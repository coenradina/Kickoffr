package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    val id: Int,
    val name: String,
    val logo: String,
    val winner: String
): Parcelable
