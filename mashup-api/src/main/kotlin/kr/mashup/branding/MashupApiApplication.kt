package kr.mashup.branding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MashupApiApplication

fun main(args: Array<String>) {
    System.setProperty("spring.config.name", "application,api")
    runApplication<MashupApiApplication>(*args)
}