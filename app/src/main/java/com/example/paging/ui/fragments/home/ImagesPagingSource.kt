package com.example.paging.ui.fragments.home

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.paging.model.Image
import com.example.paging.model.Image.ImageItem
import com.example.paging.repository.HomeRepository
import java.lang.Exception

class ImagesPagingSource (private val repository :HomeRepository) :PagingSource<Int, ImageItem>() {
    override fun getRefreshKey(state: PagingState<Int, ImageItem>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ImageItem> {
        return try {

            val currentPage = params.key ?:1
            val response = repository.getAllImages(currentPage)
            val data = response.body() ?: emptyList()
            val responseData = mutableListOf<Image.ImageItem>()
            responseData.addAll(data)
            LoadResult.Page(responseData, prevKey = if(currentPage == 1) null else currentPage-1, nextKey = currentPage.plus(1))

        }catch (e:Exception){
            LoadResult.Error(e)
        }
    }
}