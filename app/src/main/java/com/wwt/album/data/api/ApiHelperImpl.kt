package com.wwt.album.data.api

import com.wwt.album.data.db.AlbumDao
import kotlinx.coroutines.flow.flow


class ApiHelperImpl(private val apiService: ApiService, private val albumDao: AlbumDao) : ApiHelper {
    override suspend fun getAlbums(isNetworkConnected: Boolean) = flow {
        if (isNetworkConnected) {
            val list = apiService.getAlbum()?.sortedBy { it.title }
            albumDao.insertAll(list)
            emit(list)
        }
        else {
            val albumOfflineList = albumDao.getAllAlbum()
            emit(albumOfflineList)
        }

    }
}