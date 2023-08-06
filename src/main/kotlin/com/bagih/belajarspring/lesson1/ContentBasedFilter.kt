package com.bagih.belajarspring.lesson1

class ContentBasedFilter {

    fun getRecommendation(movie: String) : List<String>{
        return listOf("Happy Feet", "Ice Age", "Shark Tale")
    }
}