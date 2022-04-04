package br.com.gamagustavo.starwarswiki.model

import br.com.gamagustavo.starwarswiki.database.entitys.Planet
import com.google.gson.annotations.SerializedName

/**
 * @param name string -- The name of this planet.
 * @param diameter string -- The diameter of this planet in kilometers.
 * @param rotationPeriod string -- The number of standard hours it takes for this planet to complete a single rotation on its axis.
 * @param orbitalPeriod string -- The number of standard days it takes for this planet to complete a single orbit of its local star.
 * @param gravity string -- A number denoting the gravity of this planet, where "1" is normal or 1 standard G. "2" is twice or 2 standard Gs. "0.5" is half or 0.5 standard Gs.
 * @param population string -- The average population of sentient beings inhabiting this planet.
 * @param climate string -- The climate of this planet. Comma separated if diverse.
 * @param terrain string -- The terrain of this planet. Comma separated if diverse.
 * @param surfaceWater string -- The percentage of the planet surface that is naturally occurring water or bodies of water.
 * @param residents array -- An array of People URL Resources that live on this planet.
 * @param films array -- An array of Film URL Resources that this planet has appeared in.
 * @param url string -- the hypermedia URL of this resource.
 * @param created string -- the ISO 8601 date format of the time that this resource was created.
 * @param edited string -- the ISO 8601 date format of the time that this resource was edited.
 */

class PlanetModel(
    val name: String,
    val diameter: String,
    @SerializedName(value = "rotation_period")
    val rotationPeriod: String,
    @SerializedName(value = "orbital_period")
    val orbitalPeriod: String,
    val gravity: String,
    val population: String,
    val climate: String,
    val terrain: String,
    @SerializedName(value = "surface_water")
    val surfaceWater: String,
    val residents: List<String>,
    val films: List<String>,
    val url: String,
    val created: String,
    val edited: String,

    ) {
    fun planetModelToPlanet(): Planet {
        val planetId =
            this.url.replace("https://swapi.dev/api/planets/", "")
                .replace("/", "").toInt()
        return Planet(
            planetId = planetId,
            name = this.name,
            diameter = this.diameter,
            rotationPeriod = this.rotationPeriod,
            orbitalPeriod = this.orbitalPeriod,
            gravity = this.gravity,
            population = this.population,
            climate = this.climate,
            terrain = this.terrain,
            surfaceWater = this.surfaceWater,
            url = this.url,
            created = this.created,
            edited = this.edited,
        )
    }
}