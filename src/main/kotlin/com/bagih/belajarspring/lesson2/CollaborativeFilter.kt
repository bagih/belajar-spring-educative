package com.bagih.belajarspring.lesson2

//main
class CollaborativeFilter: Filter {
    override fun getRecommendation(movie: String): List<String>{
        return listOf("tenggelamnya kafal van der wijck", "titanic")
    }
}