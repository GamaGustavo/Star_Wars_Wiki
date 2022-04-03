package br.com.gamagustavo.starwarswiki.database.entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


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
 * @param url string -- the hypermedia URL of this resource.
 * @param created string -- the ISO 8601 date format of the time that this resource was created.
 * @param edited string -- the ISO 8601 date format of the time that this resource was edited.**/
@Entity(tableName = "planet")
data class Planet(
    @PrimaryKey(autoGenerate = false) val planetId: Int,
    val name: String,
    val diameter: String,
    @ColumnInfo(name = "rotation_period") val rotationPeriod: String,
    @ColumnInfo(name = "orbital_period") val orbitalPeriod: String,
    val gravity: String,
    val population: String,
    val climate: String,
    val terrain: String,
    @ColumnInfo(name = "surface_water") val surfaceWater: String,
    val url: String,
    val created: String,
    val edited: String,
)
