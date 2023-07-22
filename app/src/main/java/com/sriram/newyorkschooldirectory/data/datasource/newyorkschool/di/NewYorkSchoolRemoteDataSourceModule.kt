package com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.di

import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource.NewYorkSchoolRemoteDataSource
import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasourceImpl.NewYorkSchoolRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NewYorkSchoolRemoteDataSourceModule {

    @Binds
    @Singleton
    abstract fun bindNewYorkSchoolRemoteDataSource(
        newYorkSchoolRemoteDataSourceImpl: NewYorkSchoolRemoteDataSourceImpl
    ): NewYorkSchoolRemoteDataSource
}