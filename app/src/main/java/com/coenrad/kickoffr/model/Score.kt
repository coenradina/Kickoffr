package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Score(
    val halftime: Goal,
    val fulltime: Goal,
    val extratime: Goal,
    val penalty: Goal
): Parcelable
