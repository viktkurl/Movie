package ru.vd.movie.moviedetail

import ru.vd.movie.BasePresenter
import ru.vd.movie.BaseView
import ru.vd.movie.models.DetailedMovie


interface MovieDetailContract {

    interface View: BaseView<Presenter> {
        fun setLoadingIndicator(isLoading: Boolean)

        fun showMovie(detailedMovie: DetailedMovie)

        fun showMovieError()
    }

    interface Presenter: BasePresenter<View> {
        fun loadMovie()
    }
}