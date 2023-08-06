package com.bagih.belajarspring.lesson1

class RecommenderImpl {

    fun recommendedMovies(movie: String)
            : List<String> {
        val contentBasedFilter = ContentBasedFilter()
        return contentBasedFilter.getRecommendation(movie)
    }
}