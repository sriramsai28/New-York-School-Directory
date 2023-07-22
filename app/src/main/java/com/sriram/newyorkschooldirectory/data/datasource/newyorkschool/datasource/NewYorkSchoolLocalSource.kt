package com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource

import androidx.paging.LoadType
import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto

interface NewYorkSchoolLocalSource {
    suspend fun upsertAll(data: List<NewYorkSchoolDto>, loadType: LoadType)
}