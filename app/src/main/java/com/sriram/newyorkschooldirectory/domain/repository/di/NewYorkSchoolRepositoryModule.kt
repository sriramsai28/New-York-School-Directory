package com.sriram.newyorkschooldirectory.domain.repository.di

import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.NewYorkSchoolRepositoryImpl
import com.sriram.newyorkschooldirectory.domain.repository.NewYorkSchoolRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NewYorkSchoolRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindNewYorkSchoolRepository(
        newYorkSchoolRepositoryImpl: NewYorkSchoolRepositoryImpl
    ): NewYorkSchoolRepository
}