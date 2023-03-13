package com.coenrad.kickoffr.model.base

data class BaseResponse(
    val get: String = "",
    val parameters: MutableList<Any>,
    val errors: Error,
    val results: Int,
    val paging: Paging,
    val response: MutableList<Any>
)
