package com.example.paging.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.paging.repository.HomeRepository
import com.example.paging.ui.fragments.home.ImagesPagingSource

class HomeViewModel (private val repository: HomeRepository) :ViewModel() {

    val imagePager = Pager(PagingConfig(1)){
        ImagesPagingSource(repository)
    }.flow.cachedIn(viewModelScope)

}