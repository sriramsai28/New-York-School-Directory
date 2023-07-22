package com.sriram.newyorkschooldirectory.domain.usecase

import androidx.paging.Pager
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.sriram.newyorkschooldirectory.data.database.model.NewYorkSchoolEntity
import com.sriram.newyorkschooldirectory.domain.model.NewYorkSchool
import com.sriram.newyorkschooldirectory.mapper.toNewYorkSchool
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetNewYorkSchoolList @Inject constructor(
    private val pager: Pager<Int, NewYorkSchoolEntity>
) {

    fun getNewYorkSchool(
        scope: CoroutineScope
    ): Flow<PagingData<NewYorkSchool>> {
        return pager
            .flow
            .map { pageData ->
                pageData.map { entity ->
                    entity.toNewYorkSchool()
                }
            }
            .cachedIn(scope)
    }

}