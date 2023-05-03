package com.example.laboratorio05_quezada.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboratorio05_quezada.R
import com.example.laboratorio05_quezada.databinding.FragmentMovieBinding


class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMovieBinding.inflate(inflater, container, false)
       return binding.root
    }
}

