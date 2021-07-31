package com.wwt.album.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wwt.album.data.model.Album

@Database(
    entities = [Album::class],
    version = 1,
    exportSchema = false
)
abstract  class AlbumDatabase : RoomDatabase(){
    abstract fun getAlbumDAO():AlbumDao
}