package com.example.laboratorio05_quezada

import android.app.Application
import com.example.laboratorio05_quezada.data.movies
import com.example.laboratorio05_quezada.repository.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }

}