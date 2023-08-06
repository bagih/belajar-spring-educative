package com.bagih.belajarspring

import com.bagih.belajarspring.lesson2.CollaborativeFilter
import com.bagih.belajarspring.lesson2.ContentBasedFilter
import com.bagih.belajarspring.lesson2.RecommenderImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BelajarspringApplication

fun main(args: Array<String>) {
	runApplication<BelajarspringApplication>(*args)

	val recommenderImpl = RecommenderImpl(CollaborativeFilter())
	val results = recommenderImpl.recommendedMovies("KKN Desa Penari")
	println(results.toString())
}
