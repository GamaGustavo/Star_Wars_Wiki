package br.com.gamagustavo.starwarswiki.database.relation

import androidx.room.Embedded
import androidx.room.Relation
import br.com.gamagustavo.starwarswiki.database.entitys.People
import br.com.gamagustavo.starwarswiki.database.entitys.Planet

data class ResidentsOfPlanet(
    @Embedded val planet: Planet,
    @Relation(
        parentColumn = "planetId",
        entityColumn = "homeworld"
    ) val peoples: List<People>
)