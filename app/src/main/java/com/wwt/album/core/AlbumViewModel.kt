package com.wwt.album.core

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wwt.album.core.models.NBError

abstract class AlbumViewModel : ViewModel() {
    val errorLiveData = MutableLiveData<NBError>()

    protected fun handleError(error: NBError) {
        errorLiveData.postValue(error)
    }

    open fun onCreate() {
        // override when onCreate required
    }
}
