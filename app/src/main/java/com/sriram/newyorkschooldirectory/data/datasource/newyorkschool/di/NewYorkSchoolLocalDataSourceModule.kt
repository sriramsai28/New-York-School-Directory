package com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.di

import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasource.NewYorkSchoolLocalSource
import com.sriram.newyorkschooldirectory.data.datasource.newyorkschool.datasourceImpl.NewYorkSchoolLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NewYorkSchoolLocalDataSourceModule {

    @Binds
    @Singleton
    abstract fun bindNewYorkLocalDataSource(
        newYorkSchoolLocalDataSourceImpl: NewYorkSchoolLocalDataSourceImpl
    ): NewYorkSchoolLocalSource
}