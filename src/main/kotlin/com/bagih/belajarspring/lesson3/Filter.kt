package com.bagih.belajarspring.lesson3

interface Filter {
    fun getRecommendation(movie: String): List<String>
}