package br.com.gamagustavo.starwarswiki.http.webclients

import br.com.gamagustavo.starwarswiki.model.PeopleModel
import br.com.gamagustavo.starwarswiki.model.ResponseListPeople
import com.google.gson.Gson

object PeopleWebClient {

    private val path = "https://swapi.dev/api/people"
    private val gson = Gson()

    suspend fun getAllPeoples(): ResponseListPeople {
        val json = WebClientUtils.get(path)
        return gson.fromJson(json, ResponseListPeople::class.java)
    }

    suspend fun getPeoplByName(name: String): ResponseListPeople {
        val parameters = ArrayList<Pair<String, String>>()
        parameters.add(Pair("search", name))
        val json = WebClientUtils.get(path, parameters)
        return gson.fromJson(json, ResponseListPeople::class.java)
    }

    suspend fun getPeopleById(id: Int): PeopleModel {
        val pathWithId = "$path/$id/"
        val json = WebClientUtils.get(pathWithId)
        return gson.fromJson(json, PeopleModel::class.java)
    }
}