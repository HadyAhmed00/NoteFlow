package io.github.noteflow.dataBase

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import io.github.noteflow.utils.ConsVals.NOTE_TABLE
import kotlinx.android.parcel.Parcelize
@Parcelize
@Entity(tableName = NOTE_TABLE)
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val title: String,
    val content: String,
    val date: String,
    val color: String,
    val type: String):Parcelable


