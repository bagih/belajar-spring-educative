package com.bagih.belajarspring.lesson3

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component
class CollaborativeFilter: Filter {
    override fun getRecommendation(movie: String): List<String>{
        return listOf("tenggelamnya kafal van der wijck", "titanic")
    }
}