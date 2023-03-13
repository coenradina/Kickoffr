package com.coenrad.kickoffr.model

import java.util.Date

data class Fixture(
    val id: Int,
    val referee: String,
    val timezone: String,
    val date: Date,
    val timestamp: Int,
    val periods: Period,
    val venue: Venue,
    val status: Status
)
