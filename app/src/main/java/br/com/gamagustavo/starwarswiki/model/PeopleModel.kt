package br.com.gamagustavo.starwarswiki.model

import com.google.gson.annotations.SerializedName

/**
 * @author Gustavo Avila Gama
 * @param name string -- The name of this person.
 * @param birthYear string -- The birth year of the person, using the in-universe standard of BBY or ABY - Before the Battle of Yavin or After the Battle of Yavin. The Battle of Yavin is a battle that occurs at the end of Star Wars episode IV: A New Hope.
 * @param eyeColor string -- The eye color of this person. Will be "unknown" if not known or "n/a" if the person does not have an eye.
 * @param gender string -- The gender of this person. Either "Male", "Female" or "unknown", "n/a" if the person does not have a gender.
 * @param hairColor string -- The hair color of this person. Will be "unknown" if not known or "n/a" if the person does not have hair.
 * @param height string -- The height of the person in centimeters.
 * @param mass string -- The mass of the person in kilograms.
 * @param skinColor string -- The skin color of this person.
 * @param homeWorld string -- The URL of a planet resource, a planet that this person was born on or inhabits.
 * @param films array -- An array of film resource URLs that this person has been in.
 * @param species array -- An array of species resource URLs that this person belongs to.
 * @param starships array -- An array of starship resource URLs that this person has piloted.
 * @param vehicles array -- An array of vehicle resource URLs that this person has piloted.
 * @param url string -- the hypermedia URL of this resource.
 * @param created string -- the ISO 8601 date format of the time that this resource was created.
 * @param edited string -- the ISO 8601 date format of the time that this resource was edited.**/
data class PeopleModel(
    val name: String,
    @SerializedName(value = "birth_year")
    val birthYear: String,
    @SerializedName(value = "eye_color")
    val eyeColor: String,
    val height: String,
    val mass: String,
    @SerializedName(value = "hair_color")
    val hairColor: String,
    @SerializedName(value = "skin_color")
    val skinColor: String,
    val gender: String,
    @SerializedName(value = "homeworld")
    val homeWorld: String,
    val films: List<String>,
    val starships: List<String>,
    val vehicles: List<String>,
    val species: List<String>,
    val url: String,
    val created: String,
    val edited: String,
)
