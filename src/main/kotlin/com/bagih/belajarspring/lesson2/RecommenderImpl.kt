package com.bagih.belajarspring.lesson2

class RecommenderImpl(private val filter: Filter) {


    fun recommendedMovies(movie: String): List<String> {
        println("name of the filter in use is $filter \n")
        return filter.getRecommendation(movie)
    }
}