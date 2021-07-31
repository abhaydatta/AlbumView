package com.wwt.album

import com.wwt.album.domain.di.appModule
import org.junit.Test
import org.junit.experimental.categories.Category
import org.koin.test.AutoCloseKoinTest
import org.koin.test.category.CheckModuleTest


@Category(CheckModuleTest::class)
class ModuleCheckTest: AutoCloseKoinTest() {
    @Test
    fun checkModules() = org.koin.test.check.checkModules {

        modules(appModule)
    }
}