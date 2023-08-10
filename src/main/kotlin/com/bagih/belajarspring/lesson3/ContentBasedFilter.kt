package com.bagih.belajarspring.lesson3

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Lookup
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component
@Qualifier("CBF")
@Slf4j
class ContentBasedFilter(@Autowired private val movie: Movie) : Filter {

    private final val logger: Logger = LoggerFactory.getLogger(this.javaClass)
    init {
        logger.info("constructor of ContentBasedFilter is called")
    }

    @PostConstruct
    fun postConstruct(){
        logger.info("postConstruct on ContentBasedFilter is called")
    }

    @Lookup
    fun getMovie(): Movie{
        return movie
    }



    override fun getRecommendation(movie: String): List<String> {
        return listOf("Happy Feet", "Ice Age", "Shark Tale")
    }

    @PreDestroy
    fun preDestroy(){
        logger.info("ContentBasedFilter.. Pre Destroy")
    }
}