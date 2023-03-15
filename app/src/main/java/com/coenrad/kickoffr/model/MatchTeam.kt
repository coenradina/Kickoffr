package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MatchTeam(
    val home: Team,
    val away: Team
): Parcelable
