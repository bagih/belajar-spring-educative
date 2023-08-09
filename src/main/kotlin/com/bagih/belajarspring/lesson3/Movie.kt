package com.bagih.belajarspring.lesson3

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Movie() {
    companion object{
        var numInstance: Int = 0
    }

    init {
        println("movie constructor is called")
    }

    fun movieSimiliarity(movie1: Int, Movie2: Int): Double {
        return 0.0
    }

}