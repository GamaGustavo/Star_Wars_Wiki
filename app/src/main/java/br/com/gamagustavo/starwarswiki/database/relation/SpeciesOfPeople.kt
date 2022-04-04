package br.com.gamagustavo.starwarswiki.database.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import br.com.gamagustavo.starwarswiki.database.entitys.People
import br.com.gamagustavo.starwarswiki.database.entitys.PeopleSpecieCrossRef
import br.com.gamagustavo.starwarswiki.database.entitys.Specie

data class SpeciesOfPeople(
    @Embedded val people: People,
    @Relation(
        parentColumn = "peopleId",
        entityColumn = "specieId",
        associateBy = Junction(PeopleSpecieCrossRef::class)
    ) val species: List<Specie>
)
