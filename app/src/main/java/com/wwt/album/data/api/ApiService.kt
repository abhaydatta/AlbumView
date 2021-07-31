package com.wwt.album.data.api

import com.wwt.album.data.model.Album
import retrofit2.http.GET


interface ApiService {

    @GET("albums")
    suspend fun getAlbum(): List<Album>?


}