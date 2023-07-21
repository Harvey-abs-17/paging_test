package com.example.paging.di

import com.example.paging.api.ApiClient
import com.example.paging.repository.HomeRepository
import com.example.paging.ui.fragments.home.ImagesPagingSource
import com.example.paging.ui.fragments.home.adapter.ImageLoaderAdapter
import com.example.paging.ui.fragments.home.adapter.ImagesAdapter
import com.example.paging.utils.Constants
import com.example.paging.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module


object AppModule {

    val appModule = module {

        ApiClient.apply {

            single { provideBaseUrl }

            single { provideTimeOut }

            single(named(Constants.HEADER_QUALIFIER)) { provideHeaderLoggingInterceptor() }

            single(named(Constants.BODY_QUALIFIER)) { provideBodyHttpLoggingInterceptor() }

            single { provideClient( get(), get(named(Constants.HEADER_QUALIFIER)), get(named(Constants.BODY_QUALIFIER)) )}

            single { provideGson() }

            single { provideRetrofit(get(), get(), get()) }

            single { HomeRepository(get()) }

            single { ImagesPagingSource(get()) }


            single { ImageLoaderAdapter() }

            viewModel { HomeViewModel(get()) }

            single { ImagesAdapter() }
        }

    }

}