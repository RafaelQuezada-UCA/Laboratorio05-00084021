package com.example.laboratorio05_quezada.ui.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio05_quezada.MovieReviewerApplication
import com.example.laboratorio05_quezada.data.models.MovieModel
import com.example.laboratorio05_quezada.repository.MovieRepository

class MovieViewModel(private val repository: MovieRepository): ViewModel() {
    fun getMovies() = repository.getMovies()
    fun addMovie(movie: MovieModel) = repository.addMovie(movie)

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerApplication
                MovieViewModel(app.movieRepository)
            }
        }
    }
}