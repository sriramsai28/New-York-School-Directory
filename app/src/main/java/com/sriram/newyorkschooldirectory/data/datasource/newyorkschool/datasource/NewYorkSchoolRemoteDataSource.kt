package com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource

import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto

interface NewYorkSchoolRemoteDataSource {
    suspend fun getNewYorkSchool(
        page: Int,
        pageCount: Int
    ): List<NewYorkSchoolDto>
}