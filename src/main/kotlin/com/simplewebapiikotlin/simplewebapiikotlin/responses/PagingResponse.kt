package com.simplewebapiikotlin.simplewebapiikotlin.responses

data class PagingResponse<T>(
    val total: Long,
    val items: List<T>
)
