package com.sriram.newyorkschooldirectory.data.database.di

import android.content.Context
import androidx.room.Room
import com.sriram.newyorkschooldirectory.data.database.NewYorkSchoolDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideNewYorkSchoolDataBase(@ApplicationContext context: Context): NewYorkSchoolDataBase {
        return Room.databaseBuilder(
            context,
            NewYorkSchoolDataBase::class.java,
            "NewYorkSchool.db"
        ).build()
    }
}