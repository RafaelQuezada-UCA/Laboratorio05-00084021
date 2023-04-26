package com.example.laboratorio05_quezada.repository

import com.example.laboratorio05_quezada.data.models.MovieModel

class MovieRepository (private val movies: MutableList<MovieModel>) {

    fun getMovies() = movies

    fun addMovie(NewMovie: MovieModel) = movies.add(NewMovie)
}