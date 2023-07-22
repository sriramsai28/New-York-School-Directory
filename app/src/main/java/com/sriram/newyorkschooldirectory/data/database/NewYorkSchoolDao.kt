package com.sriram.newyorkschooldirectory.data.database

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.sriram.newyorkschooldirectory.data.database.model.NewYorkSchoolEntity

@Dao
interface NewYorkSchoolDao {

    @Upsert
    suspend fun upsertAll(newYorkSchoolEntity: List<NewYorkSchoolEntity>)

    @Query("SELECT * FROM NewYorkSchoolEntity")
    fun getNewYorkSchoolList(): PagingSource<Int, NewYorkSchoolEntity>

    @Query("DELETE FROM NewYorkSchoolEntity")
    suspend fun clearAll()
}