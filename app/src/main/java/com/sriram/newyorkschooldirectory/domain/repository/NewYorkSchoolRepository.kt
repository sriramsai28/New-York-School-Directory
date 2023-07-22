package com.sriram.newyorkschooldirectory.domain.repository

import androidx.paging.LoadType
import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto

interface NewYorkSchoolRepository {

    suspend fun getNewYorkSchool(
        page: Int,
        pageCount: Int,
        loadType: LoadType,
    ): List<NewYorkSchoolDto>
}