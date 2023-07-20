package com.example.paging.api

import com.example.paging.utils.Constants
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient {

    companion object {

        val provideBaseUrl = Constants.BASE_URL

        val provideTimeOut = Constants.TIME_OUT

        fun provideGson(): Gson = GsonBuilder().setLenient().create()

        fun provideBodyHttpLoggingInterceptor() = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        fun provideHeaderLoggingInterceptor() = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.HEADERS
        }

        fun provideClient(
            time_out: Long,
            headerInterceptor: HttpLoggingInterceptor,
            bodyInterceptor: HttpLoggingInterceptor
        ) = OkHttpClient.Builder()
            .callTimeout(time_out, TimeUnit.SECONDS)
            .connectTimeout(time_out, TimeUnit.SECONDS)
            .readTimeout(time_out, TimeUnit.SECONDS)
            .addInterceptor(headerInterceptor)
            .addInterceptor(bodyInterceptor)
            .build()

        fun provideRetrofit(base_url: String, gson: Gson, client: OkHttpClient): ApiServices = Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
            .create(ApiServices::class.java)


    }

}