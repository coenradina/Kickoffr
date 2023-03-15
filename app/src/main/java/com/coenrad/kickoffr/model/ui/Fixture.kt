package com.coenrad.kickoffr.model.ui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fixture (
    val id: Int,
    val firstTeamImage: String? = null,
    val firstTeamName: String,
    val secondTeamImage: String? = null,
    val secondTeamName: String,
    val matchDayDate: String,
    val matchTime: String
): Parcelable