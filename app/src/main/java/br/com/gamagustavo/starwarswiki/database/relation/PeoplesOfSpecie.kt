package br.com.gamagustavo.starwarswiki.database.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import br.com.gamagustavo.starwarswiki.database.entitys.People
import br.com.gamagustavo.starwarswiki.database.entitys.PeopleSpecieCrossRef
import br.com.gamagustavo.starwarswiki.database.entitys.Specie

data class PeoplesOfSpecie(
    @Embedded val specie: Specie,
    @Relation(
        parentColumn = "specieId",
        entityColumn = "peopleId",
        associateBy = Junction(PeopleSpecieCrossRef::class)
    ) val peoples: List<People>
)
