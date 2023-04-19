package com.example.laboratorio05_quezada

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class BillboardFragment : Fragment() {

    private lateinit var  actionToMovie: CardView
    private lateinit var actionToNew: FloatingActionButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind(view)

        actionToMovie.setOnClickListener{
            view.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }
        actionToNew.setOnClickListener{
            view.findNavController().navigate(R.id.action_billboardFragment_to_createMovieFragment)
        }
    }

    private fun bind(view: View){
        actionToMovie = view.findViewById(R.id.action_to_movie)
        actionToNew = view.findViewById(R.id.action_to_new)
    }



}