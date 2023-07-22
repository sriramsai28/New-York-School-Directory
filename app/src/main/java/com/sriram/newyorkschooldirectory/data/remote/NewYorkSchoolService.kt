package com.sriram.newyorkschooldirectory.data.remote

import com.sriram.newyorkschooldirectory.data.remote.model.NewYorkSchoolDto
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://data.cityofnewyork.us/resource/"

interface NewYorkSchoolService {

    @GET("s3k6-pzi2.json")
    suspend fun getNewYorkSchool(
        @Query("${'$'}offset") page: Int,
        @Query("${'$'}limit") pageCount: Int
    ): List<NewYorkSchoolDto>
}