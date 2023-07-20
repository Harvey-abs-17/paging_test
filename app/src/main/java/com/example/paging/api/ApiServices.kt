package com.example.paging.api

import com.example.paging.model.Image
import com.example.paging.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiServices {

    @Headers("Authorization: Client-ID ${Constants.ACCESS_KEY}")
    @GET("photos")
    suspend fun getAllImages(
        @Query("page") page: Int
    ): Response<Image>

}