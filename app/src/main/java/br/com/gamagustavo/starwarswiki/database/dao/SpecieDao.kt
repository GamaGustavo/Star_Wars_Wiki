package br.com.gamagustavo.starwarswiki.database.dao

import androidx.room.*
import br.com.gamagustavo.starwarswiki.database.entitys.Specie
import br.com.gamagustavo.starwarswiki.database.relation.PeoplesOfSpecie

@Dao
interface SpecieDao {
    @Query("SELECT * FROM specie")
    fun getAll(): List<Specie>

    @Query(value = "SELECT * FROM specie WHERE name = :name")
    fun getOneByName(name: String): Specie

    @Query(value = "SELECT * FROM specie WHERE name Like :name")
    fun getManyByName(name: String): List<Specie>

    @Query(value = "SELECT * FROM specie WHERE specieId = :specieId")
    fun getOneByName(specieId: Int): Specie

    @Insert
    fun insertAll(species: List<Specie>)

    @Delete
    fun delete(specie: Specie)

    @Query(value = "DELETE FROM specie WHERE specieId = :specieId ")
    fun deleteById(specieId: Int)

    @Transaction
    @Query("SELECT * FROM specie")
    fun getPeoplesOfSpecies(): List<PeoplesOfSpecie>
}
