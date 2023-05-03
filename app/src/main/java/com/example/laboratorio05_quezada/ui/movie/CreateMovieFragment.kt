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
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CreateMovieFragment : Fragment() {

    private val viewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }

    private lateinit var name: TextInputEditText
    private lateinit var category: TextInputEditText
    private lateinit var description: TextInputEditText
    private lateinit var qualification: TextInputEditText
    private lateinit var actionSubmit: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind(view)
        actionSubmit.setOnClickListener{ 
        createMovie()
        }
    }

    private fun bind(view: View){
        name = view.findViewById(R.id.insert_name_movie)
        category = view.findViewById(R.id.insert_category_movie)
        description = view.findViewById(R.id.insert_description_movie)
        qualification = view.findViewById(R.id.insert_qualification_movie)
        actionSubmit = view.findViewById(R.id.submit_movie_info)
    }

    private fun createMovie() {
        val newMovie = MovieModel(
            name.text.toString(),
            category.text.toString(),
            description.text.toString(),
            qualification.text.toString()
        )
        viewModel.addMovie(newMovie)

        Log.d("APP TAG", viewModel.getMovies().toString())

        findNavController().popBackStack()
    }


}