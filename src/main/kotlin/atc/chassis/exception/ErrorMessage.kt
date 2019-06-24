package atc.chassis.exception

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

import java.io.Serializable


/**
 * Simple representation of an api message.
 */
@ApiModel(description = "Simple representation of an error message.")
class ErrorMessage : Serializable {

    @ApiModelProperty(value = "Message informational text.", position = 10)
    var message: String? = null

    @ApiModelProperty(value = "Optional diagnostic information.", position = 20)
    var diagnostic: String? = null

    constructor() {}

    constructor(message: String,
                diagnostic: String) {
        this.message = message
        this.diagnostic = diagnostic
    }

    override fun toString(): String {
        val sb = StringBuffer("Message{")
        sb.append("message='").append(message).append('\'')
        sb.append(", diagnostic='").append(diagnostic).append('\'')
        sb.append('}')
        return sb.toString()
    }

    companion object {
        private const val serialVersionUID = -8470489093537747778L
    }
}
