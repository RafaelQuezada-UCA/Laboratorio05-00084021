package com.example.laboratorio05_quezada.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.laboratorio05_quezada.R
import com.example.laboratorio05_quezada.data.description
import com.example.laboratorio05_quezada.data.models.MovieModel
import com.example.laboratorio05_quezada.data.qualification2
import com.example.laboratorio05_quezada.databinding.FragmentBillboardBinding
import com.example.laboratorio05_quezada.databinding.FragmentCreateMovieBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CreateMovieFragment : Fragment() {

    private val viewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }

    private lateinit var binding: FragmentCreateMovieBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
        observeStatus()
    }

    private fun setViewModel() {
        binding.viewmodel = viewModel
    }

    private fun observeStatus() {
        viewModel.status.observe(viewLifecycleOwner) { status ->
            when {
                status.equals(MovieViewModel.MOVIE_CREATED) -> {
                    Log.d("APP TAG", status)
                    Log.d("APP TAG", viewModel.getMovies().toString())

                    viewModel.clearStatus()
                    viewModel.clearData()

                    findNavController().popBackStack()


                }
                status.equals(MovieViewModel.WRONG_DATA) -> {
                    Log.d("APP TAG", status)
                    viewModel.clearStatus()
                }
            }
        }
      }



}



