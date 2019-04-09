package atc.chassis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Credit to the following articles for some of the ideas implemented in this chassis:
 *
 * - https://medium.com/@bcarunmail/accessing-secure-rest-api-using-spring-oauth2resttemplate-ef18377e2e05
 * - https://spring.io/guides/tutorials/spring-boot-kotlin/
 *
 */
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

