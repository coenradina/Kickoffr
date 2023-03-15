package com.coenrad.kickoffr.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Status(
    val long: String,
    val short: String,
    val elapsed: Int
): Parcelable
