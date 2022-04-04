package br.com.gamagustavo.starwarswiki.database

import android.content.Context
import androidx.room.Room

object AppDataBaseBuilder {
    private var INSTANCE: AppDatabase? = null
    fun getInstance(context: Context): AppDatabase {
        if (INSTANCE == null) {
            synchronized(AppDatabase::class) {
                INSTANCE = buildRoomDB(context)
            }
        }
        return INSTANCE!!
    }

    private fun buildRoomDB(context: Context) =
        Room.databaseBuilder<AppDatabase>(
            context,
            AppDatabase::class.java,
            "star-wars-database"
        ).build()

}