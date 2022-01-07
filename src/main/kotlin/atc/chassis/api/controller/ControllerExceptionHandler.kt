package atc.chassis.api.controller

import atc.chassis.exception.ApiError
import atc.chassis.exception.BadRequestException
import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.*

@ControllerAdvice
class ControllerExceptionHandler : ResponseEntityExceptionHandler() {

  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(BadRequestException::class)
  @ResponseBody
  fun handleBadRequestException(e: BadRequestException): ResponseEntity<ApiError> {
    val apiError = ApiError.Builder
      .apiError()
      .withHttpMessage(HttpStatus.BAD_REQUEST.reasonPhrase)
      .withHttpStatusCode(HttpStatus.BAD_REQUEST.value())
      .withDescription(e.message ?: "")
      .withDetails(e.details)
      .withSupportReferenceId(UUID.randomUUID().toString())
      .build()
    log.error(apiError.toString(), e)
    return ResponseEntity(apiError, HttpStatus.BAD_REQUEST)
  }

  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Exception::class)
  @ResponseBody
  fun handleInternalError(e: Exception): ResponseEntity<ApiError> {
    val apiError = ApiError.Builder
      .apiError()
      .withHttpMessage(HttpStatus.INTERNAL_SERVER_ERROR.reasonPhrase)
      .withHttpStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
      .withDescription("An unexpected error has occurred. If the error continues, please contact support.")
      .withSupportReferenceId(UUID.randomUUID().toString())
      .build()

    logger.error(apiError.toString(), e)

    return ResponseEntity(apiError, HttpStatus.INTERNAL_SERVER_ERROR)
  }

  /**
   * Override handling of all internal Spring exceptions to return JSON.
   *
   * @param ex      the original exception
   * @param body    pretty much always null from Spring
   * @param headers the original headers
   * @param status  the http status code
   * @param request the original request
   * @return
   */
  override fun handleExceptionInternal(
    e: Exception,
    body: Any?,
    headers: HttpHeaders,
    status: HttpStatus,
    request: WebRequest
  ): ResponseEntity<Any> {
    val apiError = ApiError.Builder
      .apiError()
      .withHttpStatusCode(status.value())
      .withHttpMessage(status.reasonPhrase)
      .withDescription(e.message ?: "")
      .withSupportReferenceId(UUID.randomUUID().toString())
      .build()

    log.error(apiError.toString(), e)

    return super.handleExceptionInternal(e, apiError, headers, status, request)
  }

  companion object {
    private val log = LoggerFactory.getLogger(ControllerExceptionHandler::class.java)
  }
}
