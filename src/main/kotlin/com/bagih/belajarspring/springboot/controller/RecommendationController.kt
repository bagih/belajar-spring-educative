package com.bagih.belajarspring.springboot.controller

import com.bagih.belajarspring.springboot.model.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RecommendationController {

    @GetMapping("/movies")
    fun getAllMovies(): List<Movie>{
        return listOf(
            Movie(1, "KKN Desa Penari", 4.5),
            Movie(2, "Menculik Miyabi", 5.0),
            Movie(3, "air terjun pengantin", 3.0)
        )
    }
}