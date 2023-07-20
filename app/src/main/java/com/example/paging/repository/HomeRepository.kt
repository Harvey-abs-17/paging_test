package com.example.paging.repository

import com.example.paging.api.ApiServices

class HomeRepository(private val api :ApiServices) {

    suspend fun getAllImages(page :Int) = api.getAllImages(page = page)


}