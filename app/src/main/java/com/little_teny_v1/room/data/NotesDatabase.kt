package com.little_teny_v1.room.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NotesDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao

    abstract val dao: NoteDao
/*
    //allows access to methods to create/get the the database and uses db class as qualifier
    companion object{
        //Instance keeps a reference to the db when one is created
        //Helps maintain a single instance of the db opened at a given time
        //Value of the volatile are never cached reads/writes happen dir to main mem
        //Changes made to Instance by one thread are immediately visible to all other threads

        @Volatile
        private var Instance: NotesDatabase? = null

        fun getDatabase(context: Context): NotesDatabase {
            //synchronized initializes the null instance inside its blocks using the elvis operator ?:
            // this is a reference to the companion object
            return Instance ?: synchronized(this) {

            Room.databaseBuilder(
                context,
                NotesDatabase::class.java,
                "notes_db"
            )
                .build()
                //helps keep an reference to the recently created db instance
                .also { Instance = it }
        }
        }
    }
*/
}