package com.wwt.album.domain.repository

import com.wwt.album.data.api.ApiHelper

 open class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getAlbums(isNetworkConnected: Boolean) =  apiHelper.getAlbums(isNetworkConnected)
}