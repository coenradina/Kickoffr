package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class Fixture(
    val id: Int,
    val referee: String,
    val timezone: String,
    val date: Date,
    val timestamp: Int,
    val periods: Period,
    val venue: Venue,
    val status: Status
): Parcelable
