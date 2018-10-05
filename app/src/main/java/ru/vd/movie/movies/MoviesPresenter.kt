package ru.vd.movie.movies

class MoviesPresenter : MoviesContract.Presenter {

    private var moviesView: MoviesContract.View? = null

    override fun loadMovies() {

    }

    override fun attachView(view: MoviesContract.View) {
        moviesView = view
    }

    override fun detachView() {
        moviesView = null
    }
}