package ru.vd.movie.moviedetailimport dagger.Moduleimport dagger.Providesimport javax.inject.Singleton@Moduleclass MovieDetailPresenterModule {    @Provides    @Singleton    fun movieDetailFragment(): MovieDetailContract.Presenter = MovieDetailPresenter()}