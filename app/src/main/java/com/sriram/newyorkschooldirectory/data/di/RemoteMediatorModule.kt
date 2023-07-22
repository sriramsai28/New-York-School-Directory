package com.sriram.newyorkschooldirectory.data.di

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.sriram.newyorkschooldirectory.data.NewYorkSchoolRemoteMediator
import com.sriram.newyorkschooldirectory.data.database.NewYorkSchoolDataBase
import com.sriram.newyorkschooldirectory.data.database.model.NewYorkSchoolEntity
import com.sriram.newyorkschooldirectory.domain.repository.NewYorkSchoolRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteMediatorModule {
    @OptIn(ExperimentalPagingApi::class)
    @Provides
    @Singleton
    fun provideNewYorkSchoolPager(
        repository: NewYorkSchoolRepository,
        newYorkSchoolDataBase: NewYorkSchoolDataBase
    ): Pager<Int, NewYorkSchoolEntity> {
        return Pager(
            config = PagingConfig(pageSize = 100),
            remoteMediator = NewYorkSchoolRemoteMediator(
                repository = repository,
            ),
            pagingSourceFactory = {
                newYorkSchoolDataBase.getDAO().getNewYorkSchoolList()
            }
        )
    }
}