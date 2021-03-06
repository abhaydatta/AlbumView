package com.wwt.album.data.api

import com.wwt.album.data.model.Album
import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    suspend fun getAlbums(isNetworkConnected: Boolean): Flow<List<Album>?>
}