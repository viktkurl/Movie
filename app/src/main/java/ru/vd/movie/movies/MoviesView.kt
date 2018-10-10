package ru.vd.movie.movies

import ru.vd.movie.models.Movie

interface MoviesView : MoviesContract.View {
    override fun showMovies(movies: Array<Movie>)
}