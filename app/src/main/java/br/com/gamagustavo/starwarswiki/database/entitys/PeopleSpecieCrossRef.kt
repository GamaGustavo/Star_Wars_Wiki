package br.com.gamagustavo.starwarswiki.database.entitys

import androidx.room.Entity

@Entity(primaryKeys = ["peopleId", "specieId"])
data class PeopleSpecieCrossRef(
    val peopleId: Int,
    val specieId: Int
)
