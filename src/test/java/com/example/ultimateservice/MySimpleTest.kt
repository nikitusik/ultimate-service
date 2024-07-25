package com.example.ultimateservice

import com.intellij.database.dataSource.srcStorage.DbSrcModelStorageService
import com.intellij.database.dataSource.srcStorage.backend.DbSrcStorageManager
import com.intellij.database.psi.DbPsiFacade
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import junit.framework.TestCase

class MySimpleTest : BasePlatformTestCase() {
    fun testUltimateServices() {
        val dbPsiFacade = DbPsiFacade.getInstance(project)
        TestCase.assertNotNull(dbPsiFacade)

        val storageService = DbSrcModelStorageService.getInstance()
        TestCase.assertNotNull(storageService)

        val storageManager = DbSrcStorageManager.getInstance(project)
        TestCase.assertNotNull(storageManager)
    }
}