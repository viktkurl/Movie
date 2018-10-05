package ru.vd.movie.movies


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.vd.movie.models.Movie
import ru.vd.movie.R
import javax.inject.Inject

class MoviesFragment : Fragment(), MoviesContract.View {

    @Inject
    val moviesPresenter: MoviesPresenter? = null

    override fun showMovies(movies: Array<Movie>) {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onResume() {
        super.onResume()
        moviesPresenter?.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        moviesPresenter?.detachView()
    }

}
