package com.sriram.newyorkschooldirectory.data

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.sriram.newyorkschooldirectory.data.database.model.NewYorkSchoolEntity
import com.sriram.newyorkschooldirectory.domain.repository.NewYorkSchoolRepository
import retrofit2.HttpException
import java.io.IOException

@OptIn(ExperimentalPagingApi::class)
class NewYorkSchoolRemoteMediator(
    private val repository: NewYorkSchoolRepository,
): RemoteMediator<Int, NewYorkSchoolEntity>() {
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, NewYorkSchoolEntity>,
    ): MediatorResult {
        return try {
            val loadKey = when(loadType) {
                LoadType.REFRESH -> 1
                LoadType.PREPEND -> return MediatorResult.Success(
                    endOfPaginationReached = true
                )
                LoadType.APPEND -> {
                    val lastItem = state.lastItemOrNull()
                    if(lastItem == null) {
                        1
                    } else {
                        (lastItem.id / state.config.pageSize) + 1
                    }
                }
            }

            val newYorkSchoolList = repository.getNewYorkSchool(
                page = loadKey,
                pageCount = state.config.pageSize,
                loadType = loadType,
            )
            MediatorResult.Success(
                endOfPaginationReached = newYorkSchoolList.size<20
            )
        } catch (e: IOException) {
            MediatorResult.Error(e)
        } catch (e: HttpException) {
            MediatorResult.Error(e)
        }
    }
}