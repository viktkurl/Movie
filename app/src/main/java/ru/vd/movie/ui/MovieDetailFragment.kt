package ru.vd.movie.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_movie_detail.*
import ru.vd.movie.R
import ru.vd.movie.models.DetailedMovie
import ru.vd.movie.movies.MovieDetailContract
import ru.vd.movie.movies.MovieDetailPresenter
import ru.vd.movie.show

class MovieDetailFragment : Fragment(), MovieDetailContract.View {

    override var presenter: MovieDetailContract.Presenter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_movie_detail, container, false)

    override fun onStart() {
        super.onStart()
        presenter = MovieDetailPresenter()
        presenter?.loadMovie()
    }

    override fun setLoadingIndicator(isLoading: Boolean) {
        progressDetailsMovie.show(isLoading)
    }

    override fun showMovie(detailedMovie: DetailedMovie) {
        with(detailedMovie) {
            movieReleaseDate.text = releaseDate
            movieRuntime.text = resources.getQuantityString(R.plurals.minutes, runtime ?: 0)
            movieRating.text = voteAverage.toString()
            movieOverview.text = overview
        }
    }

    override fun showMovieError() {
        errorText.text = getString(R.string.something_went_wrong)
    }

    companion object {
        fun newInstance() = MovieDetailFragment()
    }
}
