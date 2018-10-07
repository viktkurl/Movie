package ru.vd.movie.models

data class Movie(
        val adult: Boolean,
        val budget: Int,
        val id: Int,
        val imdbId: String?,
        val originalLanguage: String,
        val originalTitle: String,
        val overview: String?,
        val popularity: Int
)