package com.sriram.newyorkschooldirectory.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sriram.newyorkschooldirectory.data.database.model.NewYorkSchoolEntity

@Database(
    version = 1001,
    entities = [NewYorkSchoolEntity::class],
    exportSchema = false
)
abstract class NewYorkSchoolDataBase : RoomDatabase() {
    abstract fun getDAO(): NewYorkSchoolDao
}