package atc.chassis.api.controller

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class ControllerExceptionHandler {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception::class)
    @ResponseBody
    fun handleInternalError(e: Exception): String {
        log.error(e.message, e)
        return HttpStatus.INTERNAL_SERVER_ERROR.reasonPhrase
    }

    companion object {
        private val log = LoggerFactory.getLogger(ControllerExceptionHandler::class.java)
    }

}
