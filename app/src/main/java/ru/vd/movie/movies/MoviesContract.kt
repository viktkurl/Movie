package ru.vd.movie.movies

import ru.vd.movie.BasePresenter
import ru.vd.movie.BaseView
import ru.vd.movie.models.Movie

interface MoviesContract {
    interface View: BaseView<Presenter> {
        fun showMovies(movies: Array<Movie>)
    }

    interface Presenter: BasePresenter<View> {
        fun loadMovies()
    }
}