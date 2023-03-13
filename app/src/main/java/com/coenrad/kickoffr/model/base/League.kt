package com.coenrad.kickoffr.model.base

data class League (
    val id: Int,
    val name: String,
    val country: String,
    val logo: String,
    val flag: String,
    val season: Int,
    val round: String
)