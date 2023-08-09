package com.bagih.belajarspring.lesson3

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Lookup
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component
@Qualifier("CBF")
class ContentBasedFilter(@Autowired private val movie: Movie) : Filter {

    @Lookup
    fun getMovie(): Movie{
        return movie
    }

    override fun getRecommendation(movie: String): List<String> {
        return listOf("Happy Feet", "Ice Age", "Shark Tale")
    }
}