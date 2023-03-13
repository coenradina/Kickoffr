package com.coenrad.kickoffr.model

data class Score(
    val halftime: Goal,
    val fulltime: Goal,
    val extratime: Goal,
    val penalty: Goal
)
