package br.com.gamagustavo.starwarswiki.model

data class ResponseListPeople(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val results: List<PeopleModel>?
)