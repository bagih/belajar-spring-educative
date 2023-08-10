package com.bagih.belajarspring.lesson3

import jakarta.annotation.PreDestroy
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
@Slf4j
class RecommenderImpl(
    @Autowired
    @Qualifier("CBF")
    private var filter: Filter
) {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    fun setFilter(filter: Filter){
        logger.info("setFilter() in RecommenderImpl.. dependency injection")
        this.filter = filter
    }

    fun postConstruct(){
        logger.info("postConstruct() in RecommenderImpl is called")
    }



    fun recommendedMovies(movie: String): List<String> {
        println("name of the filter in use is $filter \n")
        return filter.getRecommendation(movie)
    }

    @PreDestroy
    fun preDestroy(){
        logger.info("ReccomenderImpl.. Pre Destroy")
    }
}