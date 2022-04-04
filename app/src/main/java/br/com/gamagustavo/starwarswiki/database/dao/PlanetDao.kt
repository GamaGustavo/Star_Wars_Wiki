package br.com.gamagustavo.starwarswiki.database.dao

import androidx.room.*
import br.com.gamagustavo.starwarswiki.database.entitys.Planet
import br.com.gamagustavo.starwarswiki.database.relation.ResidentsOfPlanet
import br.com.gamagustavo.starwarswiki.database.relation.SpeciesOfPlanet


@Dao
interface PlanetDao {
    @Query("SELECT * FROM planet")
    fun getAll(): List<Planet>

    @Query(value = "SELECT * FROM planet WHERE name = :name")
    fun getOneByName(name: String): Planet

    @Query(value = "SELECT * FROM planet WHERE name Like :name")
    fun getManyByName(name: String): List<Planet>

    @Query(value = "SELECT * FROM planet WHERE planetId = :planetId")
    fun getOneById(planetId: Int): Planet

    @Insert
    fun insertAll(planets: List<Planet>)

    @Delete
    fun delete(planet: Planet)

    @Query(value = "DELETE FROM planet WHERE planetId = :planetId ")
    fun deleteById(planetId: Int)

    @Transaction
    @Query(value = "SELECT * FROM planet")
    fun getSpeciesOfPlanet(): List<SpeciesOfPlanet>

    @Transaction
    @Query(value = "SELECT * FROM planet")
    fun getResidentsOfPlanet(): List<ResidentsOfPlanet>
}
