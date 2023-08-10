package com.bagih.belajarspring

import com.bagih.belajarspring.lesson3.RecommenderImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BelajarspringApplication

fun main(args: Array<String>) {
	val context = runApplication<BelajarspringApplication>(*args)

	val recommenderImpl = context.getBean(RecommenderImpl::class.java)
	println(recommenderImpl)

	val results = recommenderImpl.recommendedMovies("KKN Desa Penari")
	println(results.toString())
}
