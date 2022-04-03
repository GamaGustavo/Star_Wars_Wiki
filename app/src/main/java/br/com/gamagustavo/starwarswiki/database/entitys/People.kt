package br.com.gamagustavo.starwarswiki.database.entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * @param name string --> The name of this person.
 * @param birthYear string --> The birth year of the person, using the in-universe standard of BBY or ABY - Before the Battle of Yavin or After the Battle of Yavin. The Battle of Yavin is a battle that occurs at the end of Star Wars episode IV: A New Hope.
 * @param eyeColor string --> The eye color of this person. Will be "unknown" if not known or "n/a" if the person does not have an eye.
 * @param gender string --> The gender of this person. Either "Male", "Female" or "unknown", "n/a" if the person does not have a gender.
 * @param hairColor string --> The hair color of this person. Will be "unknown" if not known or "n/a" if the person does not have hair.
 * @param height string --> The height of the person in centimeters.
 * @param mass string --> The mass of the person in kilograms.
 * @param skinColor string --> The skin color of this person.
 * @param homeWorldId Int --> forenky from the planet table, represents the id of the character's homeWorld.
 * @param url string --> the hypermedia URL of this resource.
 * @param created string --> the ISO 8601 date format of the time that this resource was created.
 * @param edited string --> the ISO 8601 date format of the time that this resource was edited.**/

@Entity
data class People(
    @PrimaryKey(autoGenerate = false) val peopleId: Int,
    val name: String,
    val height: String,
    val gender: String,
    val mass: String,
    @ColumnInfo(name = "hair_color") val hairColor: String,
    @ColumnInfo(name = "skin_color") val skinColor: String,
    @ColumnInfo(name = "eye_color") val eyeColor: String,
    @ColumnInfo(name = "birth_year") val birthYear: String,
    @ColumnInfo(name = "homeworld") val homeWorldId: Int,
    val url: String,
    val created: String,
    val edited: String,
)

