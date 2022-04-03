package br.com.gamagustavo.starwarswiki.model

data class ResponseListPlanet(
    val swapiResponseList: ResponseListGeneric<PlanetModel>
)