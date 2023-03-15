package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Goal(
    val home: Int?,
    val away: Int?
): Parcelable
