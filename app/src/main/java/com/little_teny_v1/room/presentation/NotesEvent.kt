package com.little_teny_v1.room.presentation

import com.little_teny_v1.room.data.Note

sealed interface NotesEvent{
    object SortNotes: NotesEvent

    data class DeleteNote(val note: Note): NotesEvent

    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvent
}
