package com.example.paging.ui.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.paging.PagingSource
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.paging.databinding.FragmentHomeBinding
import com.example.paging.ui.fragments.home.adapter.ImagesAdapter
import com.example.paging.viewmodel.HomeViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject


class HomeFragment : Fragment() {

    private lateinit var binding :FragmentHomeBinding
    private val homeViewModel :HomeViewModel by inject()
    private val imagesAdapter :ImagesAdapter by inject()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            // init rec
            lifecycleScope.launch {
                homeViewModel.imagePager.collect{
                    imagesAdapter.submitData(it)
                }
            }
            imagesRec.adapter = imagesAdapter
            imagesRec.layoutManager = GridLayoutManager(requireContext(),2)

            //manage progress bar loading
            lifecycleScope.launch {
                imagesAdapter.loadStateFlow.collect{
                    val state = it.refresh
                    progressBar.isVisible = state is LoadState.Loading
                }
            }
        }
    }


}