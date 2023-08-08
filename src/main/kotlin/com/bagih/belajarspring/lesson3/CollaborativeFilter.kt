package com.bagih.belajarspring.lesson3

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
@Qualifier("CF")
class CollaborativeFilter: Filter {
    override fun getRecommendation(movie: String): List<String>{
        return listOf("tenggelamnya kafal van der wijck", "titanic")
    }
}