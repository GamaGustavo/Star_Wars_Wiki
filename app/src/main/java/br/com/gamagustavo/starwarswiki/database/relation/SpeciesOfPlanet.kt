package br.com.gamagustavo.starwarswiki.database.relation

import androidx.room.Embedded
import androidx.room.Relation
import br.com.gamagustavo.starwarswiki.database.entitys.Planet
import br.com.gamagustavo.starwarswiki.database.entitys.Specie

data class SpeciesOfPlanet(
    @Embedded val planet: Planet,
    @Relation(
        parentColumn = "planetId",
        entityColumn = "homeworld"
    ) val species: List<Specie>
)