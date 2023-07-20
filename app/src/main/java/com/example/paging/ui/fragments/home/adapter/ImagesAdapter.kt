package com.example.paging.ui.fragments.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.paging.databinding.ItemImagesBinding
import com.example.paging.model.Image.ImageItem
import com.squareup.picasso.Picasso

class ImagesAdapter : PagingDataAdapter<ImageItem, ImagesAdapter.ImagesViewHolder>(differCallback) {

    private lateinit var binding: ItemImagesBinding


    inner class ImagesViewHolder : RecyclerView.ViewHolder(binding.root) {

        fun bindViews(itemImage :ImageItem){
            binding.apply {
                Picasso.get().load(itemImage.urls!!.regular).into(image)
            }
        }

    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        holder.bindViews(getItem(position)!!)
        holder.isRecyclable
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        binding = ItemImagesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImagesViewHolder()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    companion object {
        private val differCallback = object : DiffUtil.ItemCallback<ImageItem>() {
            override fun areItemsTheSame(oldItem: ImageItem, newItem: ImageItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ImageItem, newItem: ImageItem): Boolean {
                return oldItem == newItem
            }
        }
    }
}