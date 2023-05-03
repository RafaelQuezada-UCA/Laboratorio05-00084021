package com.example.laboratorio05_quezada.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.example.laboratorio05_quezada.R
import com.example.laboratorio05_quezada.databinding.FragmentBillboardBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class BillboardFragment : Fragment() {

    /*private lateinit var  actionToMovie: CardView
    private lateinit var actionToNew: FloatingActionButton*/

    private lateinit var binding: FragmentBillboardBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBillboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.actionToMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }
        binding.actionToNew.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_createMovieFragment)
        }
    }




}