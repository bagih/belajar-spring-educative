package com.bagih.belajarspring

import com.bagih.belajarspring.lesson3.CollaborativeFilter
import com.bagih.belajarspring.lesson3.ContentBasedFilter
import com.bagih.belajarspring.lesson3.RecommenderImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BelajarspringApplication

fun main(args: Array<String>) {
	val context = runApplication<BelajarspringApplication>(*args)

	val recommenderImpl = context.getBean(RecommenderImpl::class.java)

//	collaborative filter use prototype scope
	val cf1 = context.getBean(CollaborativeFilter::class.java)
	val cf2 = context.getBean(CollaborativeFilter::class.java)
	val cf3 = context.getBean(CollaborativeFilter::class.java)

//	contentBased filter uses singleton scope
	val cb1 = context.getBean(ContentBasedFilter::class.java)
	val cb2 = context.getBean(ContentBasedFilter::class.java)
	val cb3 = context.getBean(ContentBasedFilter::class.java)

//	print all collaborative filter bean instance
	println(cf1)
	println(cf2)
	println(cf3)

//	print all contentBased filter instance
	println(cb1)
	println(cb2)
	println(cb3)

	val results = recommenderImpl.recommendedMovies("KKN Desa Penari")
	println(results.toString())
}
