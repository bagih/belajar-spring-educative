package com.bagih.belajarspring.lesson3

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component
@Qualifier("CBF")
class ContentBasedFilter: Filter{

    override fun getRecommendation(movie: String) : List<String>{
        return listOf("Happy Feet", "Ice Age", "Shark Tale")
    }
}