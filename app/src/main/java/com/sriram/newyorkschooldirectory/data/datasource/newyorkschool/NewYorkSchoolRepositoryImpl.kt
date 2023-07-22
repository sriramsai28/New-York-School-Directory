package com.sriram.newyorkschooldirectory.data.datasource.newyorkschool

import androidx.paging.LoadType
import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource.NewYorkSchoolLocalSource
import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource.NewYorkSchoolRemoteDataSource
import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto
import com.sriram.newyorkschooldirectory.domain.repository.NewYorkSchoolRepository
import javax.inject.Inject

class NewYorkSchoolRepositoryImpl @Inject constructor(
    private val remoteDataSource: NewYorkSchoolRemoteDataSource,
    private val localDataSource: NewYorkSchoolLocalSource,
) : NewYorkSchoolRepository {
    override suspend fun getNewYorkSchool(
        page: Int,
        pageCount: Int,
        loadType: LoadType,
    ): List<NewYorkSchoolDto> {
        return getNewYorkSchoolServer(
            page = page,
            pageCount = pageCount,
            loadType = loadType,
        )
    }

    private suspend fun getNewYorkSchoolServer(
        page: Int,
        pageCount: Int,
        loadType: LoadType,
    ): List<NewYorkSchoolDto> {
        val newYorkSchoolDtoList = remoteDataSource.getNewYorkSchool(
            page = page,
            pageCount = pageCount,
        )
        setNewYorkSchoolToDataBase(
            newYorkSchoolDtoList = newYorkSchoolDtoList,
            loadType = loadType,
        )
        return newYorkSchoolDtoList
    }

    private suspend fun setNewYorkSchoolToDataBase(
        newYorkSchoolDtoList: List<NewYorkSchoolDto>,
        loadType: LoadType,
    ) {
        localDataSource.upsertAll(
            data = newYorkSchoolDtoList,
            loadType = loadType,
        )
    }
}