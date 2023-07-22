package com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasourceImpl

import androidx.paging.LoadType
import androidx.room.withTransaction
import com.sriram.newyorkschooldirectory.data.database.NewYorkSchoolDataBase
import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource.NewYorkSchoolLocalSource
import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto
import com.sriram.newyorkschooldirectory.mapper.toNewYorkEntity
import javax.inject.Inject

class NewYorkSchoolLocalDataSourceImpl @Inject constructor(
    private val dataBase: NewYorkSchoolDataBase
) : NewYorkSchoolLocalSource {
    private val dao = dataBase.getDAO()
    override suspend fun upsertAll(
        data: List<NewYorkSchoolDto>,
        loadType: LoadType
    ) {
        dataBase.withTransaction {
            if (loadType == LoadType.REFRESH) {
                dao.clearAll()
            }
        }
        val entity = data.map {
            it.toNewYorkEntity()
        }
        dao.upsertAll(entity)
    }
}