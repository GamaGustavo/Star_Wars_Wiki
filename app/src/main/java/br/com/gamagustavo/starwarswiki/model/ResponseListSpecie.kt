package br.com.gamagustavo.starwarswiki.model

data class ResponseListSpecie(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val results: List<SpecieModel>?
)