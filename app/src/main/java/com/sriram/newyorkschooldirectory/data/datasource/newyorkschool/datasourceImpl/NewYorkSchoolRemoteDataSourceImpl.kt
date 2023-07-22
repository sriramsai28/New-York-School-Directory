package com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasourceImpl

import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource.NewYorkSchoolRemoteDataSource
import com.sriram.newyorkschooldirectory.data.remote.NewYorkSchoolService
import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto
import javax.inject.Inject

class NewYorkSchoolRemoteDataSourceImpl @Inject constructor(
    private val newYorkSchoolService: NewYorkSchoolService
) : NewYorkSchoolRemoteDataSource {
    override suspend fun getNewYorkSchool(
        page: Int,
        pageCount: Int
    ): List<NewYorkSchoolDto> {
        return newYorkSchoolService.getNewYorkSchool(page, pageCount)
    }
}