package com.wwt.album.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.wwt.album.core.handler.ABErrorProvider
import com.wwt.album.core.models.NBError
import com.wwt.album.data.util.NetworkHelper
import org.koin.android.ext.android.inject

abstract class AlbumBaseActivity<B : ViewBinding, V : AlbumViewModel> : AppCompatActivity(),
    ABErrorProvider {
    protected lateinit var viewModel: V
    protected lateinit var binding: B

    protected val networkHelper: NetworkHelper by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = initBinding()
        setContentView(binding.root)
        viewModel = initViewModel()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        viewModel.onCreate()
        observeErrorModel(viewModel)
    }


    override fun showError(error: NBError) {
        // show alert box here
    }

    abstract fun initViewModel(): V
    abstract fun initBinding(): B
}