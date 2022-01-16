package kr.mashup.branding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MashupAdminApplication

fun main(args: Array<String>) {
    System.setProperty("spring.config.name", "application,admin")
    runApplication<MashupAdminApplication>(*args)
}