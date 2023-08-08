package com.bagih.belajarspring.lesson3

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
class ContentBasedFilter: Filter{

    override fun getRecommendation(movie: String) : List<String>{
        return listOf("Happy Feet", "Ice Age", "Shark Tale")
    }
}