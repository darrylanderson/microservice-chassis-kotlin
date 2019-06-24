package atc.chassis.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.util.*


@ResponseStatus(HttpStatus.BAD_REQUEST)
class BadRequestException : AbstractApiException {
    constructor(message: String) : super(message)
    constructor(message: String, e: Throwable) : super(message, e)
    constructor(message: String, details: List<ErrorMessage>) : super(message, details)
    constructor(message: String, details: List<ErrorMessage>, e: Throwable) : super(message, details, e)
}


open class AbstractApiException : RuntimeException {
    var details: List<ErrorMessage> = ArrayList()

    constructor(message: String) : super(message)

    constructor(message: String, e: Throwable) : super(message, e)

    constructor(message: String, details: List<ErrorMessage>) : this(message) {
        this.details = details
    }

    constructor(message: String, details: List<ErrorMessage>, e: Throwable) : super(message, e) {
        this.details = details
    }


}