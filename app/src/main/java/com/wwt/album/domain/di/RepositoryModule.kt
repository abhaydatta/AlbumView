package com.wwt.album.domain.di

import com.wwt.album.domain.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}