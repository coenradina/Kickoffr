package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Period(
    val first: Int,
    val second: Int
): Parcelable