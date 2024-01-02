package com.little_teny_v1.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    //database elements
    val title: String,
    val description: String,
    val dateAdded: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
