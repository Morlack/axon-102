package com.insidion.axon102

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication


@SpringBootApplication
@EnableConfigurationProperties
class MetadataDemoApplication {
}

fun main(args: Array<String>) {
    runApplication<MetadataDemoApplication>(*args)
}
