package com.bagih.belajarspring.lesson3

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Qualifier("CF")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class CollaborativeFilter: Filter {
    override fun getRecommendation(movie: String): List<String>{
        return listOf("tenggelamnya kafal van der wijck", "titanic")
    }
}