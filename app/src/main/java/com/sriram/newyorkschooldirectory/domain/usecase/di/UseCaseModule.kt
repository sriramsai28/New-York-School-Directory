package com.sriram.newyorkschooldirectory.domain.usecase.di

import androidx.paging.Pager
import com.sriram.newyorkschooldirectory.data.database.model.NewYorkSchoolEntity
import com.sriram.newyorkschooldirectory.domain.usecase.GetNewYorkSchoolList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetNewYorkSchoolList(
        page: Pager<Int, NewYorkSchoolEntity>
    ): GetNewYorkSchoolList {
        return GetNewYorkSchoolList(page)
    }
}