package ru.spb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Kotlinrest

fun main(args: Array<String>) {
    SpringApplication.run(Kotlinrest::class.java, *args)
}