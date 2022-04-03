package br.com.gamagustavo.starwarswiki.http.webclients

import br.com.gamagustavo.starwarswiki.model.ResponseListSpecie
import br.com.gamagustavo.starwarswiki.model.SpecieModel
import com.google.gson.Gson

object SpecieWbeClient {
    private val path = "https://swapi.dev/api/species"
    private val gson = Gson()

    suspend fun getAllSpecies(): ResponseListSpecie {
        val json = WebClientUtils.get(path)
        return gson.fromJson(json, ResponseListSpecie::class.java)

    }

    suspend fun getSpeciesByName(name: String): ResponseListSpecie {
        val parameters = ArrayList<Pair<String, String>>()
        parameters.add(Pair("search", name))
        val json = WebClientUtils.get(path, parameters)
        return gson.fromJson(json, ResponseListSpecie::class.java)
    }

    suspend fun getSpecieById(id: Int): SpecieModel {
        val pathWithId = "$path/$id/"
        val json = WebClientUtils.get(pathWithId)
        return gson.fromJson(json, SpecieModel::class.java)
    }
}