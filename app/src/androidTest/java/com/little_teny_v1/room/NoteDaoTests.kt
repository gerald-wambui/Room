package com.little_teny_v1.room

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.little_teny_v1.room.data.NoteDao
import com.little_teny_v1.room.data.NotesDatabase
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class NoteDaoTests{
	private lateinit var noteDao: NoteDao
	private lateinit var db: NotesDatabase

	@Before
	fun createDb() {
		val context: Context = ApplicationProvider.getApplicationContext()

		db = Room.inMemoryDatabaseBuilder(context, NotesDatabase::class.java)
			.allowMainThreadQueries()
			.build()
		noteDao = db.noteDao()
	}

	@After
	@Throws(IOException::class)
	fun closeDb(){
		db.close()
	}

}
