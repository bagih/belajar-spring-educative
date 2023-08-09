package com.bagih.belajarspring.lesson3

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class RecommenderImpl(
    @Autowired
    @Qualifier("CBF")
    private val filter: Filter
) {


    fun recommendedMovies(movie: String): List<String> {
        println("name of the filter in use is $filter \n")
        return filter.getRecommendation(movie)
    }
}