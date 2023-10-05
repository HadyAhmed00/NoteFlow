package io.github.noteflow

import android.graphics.Color
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Note(val id: Int,
                val title: String,
                val content: String,
                val date: String,
                val color: String,
                val type: String):Parcelable


