package com.bagih.belajarspring.lesson2

class ContentBasedFilter: Filter{

    override fun getRecommendation(movie: String) : List<String>{
        return listOf("Happy Feet", "Ice Age", "Shark Tale")
    }
}