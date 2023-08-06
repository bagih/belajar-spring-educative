package com.bagih.belajarspring.lesson2

interface Filter {
    fun getRecommendation(movie: String): List<String>
}