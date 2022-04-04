package br.com.gamagustavo.starwarswiki.http.webclients

import br.com.gamagustavo.starwarswiki.model.PlanetModel
import br.com.gamagustavo.starwarswiki.model.ResponseListPlanet
import com.google.gson.Gson

object PlanetWebClient {
    private const val path = "https://swapi.dev/api/planets"
    private val gson = Gson()

    suspend fun getAllPlanets(): ResponseListPlanet {
        val json = WebClientUtils.get(path)
        return gson.fromJson(json, ResponseListPlanet::class.java)
    }

    suspend fun getPlanetByName(name: String): ResponseListPlanet {
        val parameters = ArrayList<Pair<String, String>>()
        parameters.add(Pair("search", name))
        val json = WebClientUtils.get(path, parameters)
        return gson.fromJson(json, ResponseListPlanet::class.java)
    }

    suspend fun getPlanetById(id: Int): PlanetModel {
        val pathWithId = "$path/$id/"
        val json = WebClientUtils.get(pathWithId)
        return gson.fromJson(json, PlanetModel::class.java)
    }
}