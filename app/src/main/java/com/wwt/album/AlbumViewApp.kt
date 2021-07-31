package com.wwt.album

import android.app.Application
import com.wwt.album.domain.di.appModule
import com.wwt.album.domain.di.databaseModule
import com.wwt.album.domain.di.repoModule
import com.wwt.album.domain.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AlbumViewApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AlbumViewApp)
            modules(listOf(appModule, repoModule, viewModelModule, databaseModule))
        }
    }
}