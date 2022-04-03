package br.com.gamagustavo.starwarswiki.model

data class ResponseListSpecie(
    val swapiResponseList: ResponseListGeneric<SpecieModel>
)