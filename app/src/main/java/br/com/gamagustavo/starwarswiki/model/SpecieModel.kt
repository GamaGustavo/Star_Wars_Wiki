package br.com.gamagustavo.starwarswiki.model

import br.com.gamagustavo.starwarswiki.database.entitys.Specie
import com.google.gson.annotations.SerializedName


/**
 * @author Gustavo Avila Gama
 * @param name string -- The name of this species.
 * @param classification string -- The classification of this species, such as "mammal" or "reptile".
 * @param designation string -- The designation of this species, such as "sentient".
 * @param averageHeight string -- The average height of this species in centimeters.
 * @param averageLifespan string -- The average lifespan of this species in years.
 * @param eyeColors string -- A comma-separated string of common eye colors for this species, "none" if this species does not typically have eyes.
 * @param hairColors string -- A comma-separated string of common hair colors for this species, "none" if this species does not typically have hair.
 * @param skinColors string -- A comma-separated string of common skin colors for this species, "none" if this species does not typically have skin.
 * @param language string -- The language commonly spoken by this species.
 * @param homeWorld string -- The URL of a planet resource, a planet that this species originates from.
 * @param people array -- An array of People URL Resources that are a part of this species.
 * @param films array -- An array of Film URL Resources that this species has appeared in.
 * @param url string -- the hypermedia URL of this resource.
 * @param created string -- the ISO 8601 date format of the time that this resource was created.
 * @param edited string -- the ISO 8601 date format of the time that this resource was edited.
 * */
class SpecieModel(
    val name: String,
    val classification: String,
    val designation: String,
    @SerializedName(value = "average_height")
    val averageHeight: String,
    @SerializedName(value = "average_lifespan")
    val averageLifespan: String,
    @SerializedName(value = "eye_colors")
    val eyeColors: String,
    @SerializedName(value = "hair_colors")
    val hairColors: String,
    @SerializedName(value = "skin_colors")
    val skinColors: String,
    val language: String,
    @SerializedName(value = "homeworld")
    val homeWorld: String,
    val people: List<String>,
    val films: List<String>,
    val url: String,
    val created: String,
    val edited: String,
) {
    fun specieModelToSpecie(): Specie {
        val homeWold =
            this.homeWorld.replace("https://swapi.dev/api/planets/", "")
                .replace("/", "").toInt()
        val specieId =
            this.url.replace("https://swapi.dev/api/species/", "")
                .replace("/", "").toInt()
        return Specie(
            specieId = specieId,
            homeWorldId = homeWold,
            edited = this.edited,
            created = this.created,
            url = this.url,
            name = this.name,
            averageHeight = this.averageHeight,
            averageLifespan = this.averageLifespan,
            classification = this.classification,
            designation = this.designation,
            eyeColors = this.eyeColors,
            hairCcolors = this.hairColors,
            language = this.language,
            skincolors = this.skinColors,
        )
    }
}