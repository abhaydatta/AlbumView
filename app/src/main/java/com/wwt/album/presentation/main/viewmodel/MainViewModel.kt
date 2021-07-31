package com.wwt.album.presentation.main.viewmodel

import androidx.lifecycle.*
import com.wwt.album.core.AlbumViewModel
import com.wwt.album.core.models.NBError
import com.wwt.album.data.model.Album
import com.wwt.album.data.util.DataState

import com.wwt.album.domain.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest

import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(
    private val mainRepository: MainRepository
) : AlbumViewModel() {
    private val albumList = MutableLiveData<DataState<List<Album>>>()

    fun fetchAlbumList(isNetworkConnected: Boolean) {
        if (isNetworkConnected)
            handleError(NBError(customMessage = "No internet connection!!"))
        callAlbumList(isNetworkConnected)
    }

    private fun callAlbumList(isNetworkConnected: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            albumList.postValue(DataState.Loading)
            try {
                mainRepository.getAlbums(isNetworkConnected).collectLatest { response ->
                    response?.let {
                        albumList.postValue(DataState.Success(it))
                    } ?: albumList.postValue(DataState.NullResponse)
                }
            } catch (e: Exception) {
                handleError(NBError(e))
            }
        }
    }

    val album: LiveData<DataState<List<Album>>>
        get() = albumList
}