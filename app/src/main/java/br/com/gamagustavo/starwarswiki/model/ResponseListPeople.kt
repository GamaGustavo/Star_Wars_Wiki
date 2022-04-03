package br.com.gamagustavo.starwarswiki.model

data class ResponseListPeople(
    val swapiResponseList: ResponseListGeneric<PeopleModel>
)