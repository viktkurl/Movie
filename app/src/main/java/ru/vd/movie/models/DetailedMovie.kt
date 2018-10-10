package ru.vd.movie.models

import com.squareup.moshi.Json
import java.util.Arrays

data class DetailedMovie(
        val adult: Boolean,
        @Json(name = "backdrop_path") val backdropPath: String?,
        @Json(name = "belongs_to_collection") val belongsToCollection: Any?,
        val budget: Int,
        val genres: Array<Genre>,
        val homepage: String,
        val id: Int,
        @Json(name = "imdb_id") val imdbId: String?,
        @Json(name = "original_language") val originalLanguage: String,
        @Json(name = "original_title") val originalTitle: String,
        val overview: String?,
        val popularity: Double,
        @Json(name = "poster_path") val posterPath: String?,
        @Json(name = "production_companies") val productionCompanies: Array<ProductionCompanies>,
        @Json(name = "production_countries") val productionCountries: Array<ProductionCountries>,
        @Json(name = "release_date") val releaseDate: String,
        val revenue: Int,
        val runtime: Int?,
        @Json(name = "spoken_languages") val spokenLanguages: Array<SpokenLanguage>,
        val status: String,
        val tagline: String?,
        val title: String,
        val video: Boolean,
        @Json(name = "vote_average") val voteAverage: Double,
        @Json(name = "vote_count") val voteCount: Int
) {
    data class Genre(val id: Int,
                     val name: String)

    data class ProductionCompanies(val name: String,
                                   val id: Int,
                                   @Json(name = "logo_path") val logoPath: String,
                                   @Json(name = "origin_country") val originCountry: String)

    data class ProductionCountries(@Json(name = "iso_3166_1") val countryISO: String,
                                   val name: String)

    data class SpokenLanguage(@Json(name = "iso_639_1") val langISO: String,
                              val name: String)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DetailedMovie

        if (adult != other.adult) return false
        if (backdropPath != other.backdropPath) return false
        if (belongsToCollection != other.belongsToCollection) return false
        if (budget != other.budget) return false
        if (!Arrays.equals(genres, other.genres)) return false
        if (homepage != other.homepage) return false
        if (id != other.id) return false
        if (imdbId != other.imdbId) return false
        if (originalLanguage != other.originalLanguage) return false
        if (originalTitle != other.originalTitle) return false
        if (overview != other.overview) return false
        if (popularity != other.popularity) return false
        if (posterPath != other.posterPath) return false
        if (!Arrays.equals(productionCompanies, other.productionCompanies)) return false
        if (!Arrays.equals(productionCountries, other.productionCountries)) return false
        if (releaseDate != other.releaseDate) return false
        if (revenue != other.revenue) return false
        if (runtime != other.runtime) return false
        if (!Arrays.equals(spokenLanguages, other.spokenLanguages)) return false
        if (status != other.status) return false
        if (tagline != other.tagline) return false
        if (title != other.title) return false
        if (video != other.video) return false
        if (voteAverage != other.voteAverage) return false
        if (voteCount != other.voteCount) return false

        return true
    }

    override fun hashCode(): Int {
        var result = adult.hashCode()
        result = 31 * result + (backdropPath?.hashCode() ?: 0)
        result = 31 * result + (belongsToCollection?.hashCode() ?: 0)
        result = 31 * result + budget
        result = 31 * result + Arrays.hashCode(genres)
        result = 31 * result + homepage.hashCode()
        result = 31 * result + id
        result = 31 * result + (imdbId?.hashCode() ?: 0)
        result = 31 * result + originalLanguage.hashCode()
        result = 31 * result + originalTitle.hashCode()
        result = 31 * result + (overview?.hashCode() ?: 0)
        result = 31 * result + popularity.hashCode()
        result = 31 * result + (posterPath?.hashCode() ?: 0)
        result = 31 * result + Arrays.hashCode(productionCompanies)
        result = 31 * result + Arrays.hashCode(productionCountries)
        result = 31 * result + releaseDate.hashCode()
        result = 31 * result + revenue
        result = 31 * result + (runtime ?: 0)
        result = 31 * result + Arrays.hashCode(spokenLanguages)
        result = 31 * result + status.hashCode()
        result = 31 * result + (tagline?.hashCode() ?: 0)
        result = 31 * result + title.hashCode()
        result = 31 * result + video.hashCode()
        result = 31 * result + voteAverage.hashCode()
        result = 31 * result + voteCount
        return result
    }
}