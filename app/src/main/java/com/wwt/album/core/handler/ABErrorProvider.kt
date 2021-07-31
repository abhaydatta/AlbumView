package com.wwt.album.core.handler

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.wwt.album.core.AlbumViewModel
import com.wwt.album.core.models.NBError

interface ABErrorProvider : LifecycleOwner {

    fun observeErrorModel(nimbleViewModel: AlbumViewModel?) {
        nimbleViewModel?.errorLiveData?.observe(this, Observer {
            showError(it)
        })
    }

    fun showError(error: NBError)
}