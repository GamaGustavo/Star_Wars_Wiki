package br.com.gamagustavo.starwarswiki.model

data class ResponseListGeneric<T>(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val result: List<T>?
)

