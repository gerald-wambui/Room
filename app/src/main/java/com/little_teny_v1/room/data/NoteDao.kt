package com.little_teny_v1.room.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    //Perform crud ops .. room db ops ..abstraction of sqllite
    //@upsert -> adds and updates ..addNote updateNote
    @Upsert
    suspend fun upsertNote(note: Note)
    @Delete
    suspend fun deleteNote(note: Note)
    @Query("SELECT * FROM note ORDER BY  dateAdded")
    fun getNoteOrderedByDateAdded(): Flow<List<Note>>

    @Query("SELECT * FROM note ORDER BY  title ASC")
    fun getNoteOrderedByTitle(): Flow<List<Note>>
}