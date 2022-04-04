package br.com.gamagustavo.starwarswiki.database.entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @param name string -- The name of this species.
 * @param classification string -- The classification of this species, such as "mammal" or "reptile".
 * @param designation string -- The designation of this species, such as "sentient".
 * @param averageHeight string -- The average height of this species in centimeters.
 * @param averageLifespan string -- The average lifespan of this species in years.
 * @param eyeColors string -- A comma-separated string of common eye colors for this species, "none" if this species does not typically have eyes.
 * @param hairCcolors string -- A comma-separated string of common hair colors for this species, "none" if this species does not typically have hair.
 * @param skincolors string -- A comma-separated string of common skin colors for this species, "none" if this species does not typically have skin.
 * @param language string -- The language commonly spoken by this species.
 * @param homeWorldId Int --> forenky from the planet table, represents the id of the specie's homeWorld.
 * @param url string -- the hypermedia URL of this resource.
 * @param created string -- the ISO 8601 date format of the time that this resource was created.
 * @param edited string -- the ISO 8601 date format of the time that this resource was edited.**/
@Entity
data class Specie(
    @PrimaryKey(autoGenerate = false) val specieId: Int,
    val name: String,
    val classification: String,
    val designation: String,
    @ColumnInfo(name = "average_height") val averageHeight: String,
    @ColumnInfo(name = "average_lifespan") val averageLifespan: String,
    @ColumnInfo(name = "hair_colors") val hairCcolors: String,
    @ColumnInfo(name = "skin_colors") val skincolors: String,
    @ColumnInfo(name = "eye_colors") val eyeColors: String,
    val language: String,
    val url: String,
    @ColumnInfo(name = "homeworld") val homeWorldId: Int,
    val created: String,
    val edited: String,
)
