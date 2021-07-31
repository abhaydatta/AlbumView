package com.wwt.album.data.db

import androidx.room.*
import com.wwt.album.data.model.Album

@Dao
interface AlbumDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(album: Album)

    @Query("SELECT * FROM album ORDER BY Title")
    fun getAllAlbum(): List<Album>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(albumList: List<Album>?)

    @Delete
    suspend fun deleteAlbum(album: Album)
}