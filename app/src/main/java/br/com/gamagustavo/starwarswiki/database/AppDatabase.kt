package br.com.gamagustavo.starwarswiki.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.gamagustavo.starwarswiki.database.dao.PeopleDao
import br.com.gamagustavo.starwarswiki.database.dao.PeopleSpecieCrossRefDao
import br.com.gamagustavo.starwarswiki.database.dao.PlanetDao
import br.com.gamagustavo.starwarswiki.database.dao.SpecieDao
import br.com.gamagustavo.starwarswiki.database.entitys.People
import br.com.gamagustavo.starwarswiki.database.entitys.PeopleSpecieCrossRef
import br.com.gamagustavo.starwarswiki.database.entitys.Planet
import br.com.gamagustavo.starwarswiki.database.entitys.Specie

@Database(
    entities = [People::class, Planet::class, Specie::class, PeopleSpecieCrossRef::class],
    version = 2
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun peopleDao(): PeopleDao
    abstract fun planetDao(): PlanetDao
    abstract fun specieDao(): SpecieDao
    abstract fun peopleSpecieCrossRefDao(): PeopleSpecieCrossRefDao
}
