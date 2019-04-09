package atc.chassis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * https://medium.com/@bcarunmail/accessing-secure-rest-api-using-spring-oauth2resttemplate-ef18377e2e05
 */
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

