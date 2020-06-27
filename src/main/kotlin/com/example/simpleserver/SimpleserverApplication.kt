package com.example.simpleserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleserverApplication

fun main(args: Array<String>) {
	runApplication<SimpleserverApplication>(*args)
}
