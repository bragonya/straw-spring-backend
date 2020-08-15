package com.juicebox.straw

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StrawApplication

fun main(args: Array<String>) {
	runApplication<StrawApplication>(*args)
}
