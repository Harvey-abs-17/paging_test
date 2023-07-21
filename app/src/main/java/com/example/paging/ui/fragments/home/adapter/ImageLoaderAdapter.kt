package com.example.paging.ui.fragments.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.paging.databinding.ItemLoaderBinding

class ImageLoaderAdapter() : LoadStateAdapter<ImageLoaderAdapter.LoaderViewHolder>() {

    private lateinit var binding: ItemLoaderBinding

    inner class LoaderViewHolder() : RecyclerView.ViewHolder(binding.root) {

        fun bindViews(loadState: LoadState) {
            binding.apply {
                progressBar.isVisible = loadState is LoadState.Loading
                errorTxt.isVisible = loadState is LoadState.Error
                retryBtn.isVisible = loadState is LoadState.Error
                retryBtn.setOnClickListener {
                    itemListener?.let {
                        it()
                    }
                }
            }
        }
    }

    private var itemListener: (() -> Unit?)? = null
    fun onItemClickListener(listener: () -> Unit) {
        itemListener = listener
    }

    override fun onBindViewHolder(holder: LoaderViewHolder, loadState: LoadState) {
        holder.bindViews(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoaderViewHolder {
        binding = ItemLoaderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LoaderViewHolder()
    }

}