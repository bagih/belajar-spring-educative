package com.bagih.belajarspring

import com.bagih.belajarspring.lesson3.ContentBasedFilter
import com.bagih.belajarspring.lesson3.RecommenderImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BelajarspringApplication

fun main(args: Array<String>) {
	val context = runApplication<BelajarspringApplication>(*args)

	val recommenderImpl = context.getBean(RecommenderImpl::class.java)

	val filter = context.getBean(ContentBasedFilter::class.java)
	println(filter)

	val movie1 = filter.getMovie()
	val movie2 = filter.getMovie()
	val movie3 = filter.getMovie()

	println(movie1)
	println(movie2)
	println(movie3)

	val results = recommenderImpl.recommendedMovies("KKN Desa Penari")
	println(results.toString())
}
