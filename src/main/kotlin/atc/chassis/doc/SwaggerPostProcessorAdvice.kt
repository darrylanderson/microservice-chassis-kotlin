package atc.chassis.doc

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.fasterxml.jackson.databind.node.ObjectNode
import org.slf4j.LoggerFactory
import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice
import springfox.documentation.spring.web.json.Json
import springfox.documentation.swagger2.web.Swagger2Controller


/**
 * This advice object is necessary to hook into the autogenerated swagger.json and do certain post-processing
 * steps. This is required because springfox doesn't always enable enough hooks.
 *
 *  * Make method names not look dumb (they currently have "_1" at the end of them). Basically, it will scan the
 * swagger document structure and replace all the operationId node values
 * that have "_?" in them with a sanitized form.
 *
 *  * Order the tags. For some unknown reason, springfox/swagger doesn't like ordering. So this is the only
 * way to avoid the HashSet they use for all their data structures.
 *
 *
 */
@ControllerAdvice(assignableTypes = [Swagger2Controller::class])
class SwaggerPostProcessorAdvice : ResponseBodyAdvice<Any> {

    override fun supports(
        returnType: MethodParameter,
        converterType: Class<out HttpMessageConverter<*>>
    ): Boolean {
        return true
    }


    override fun beforeBodyWrite(
        body: Any?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): Any? {
        try {
            val objectMapper = ObjectMapper()
            val document = objectMapper.readTree((body as Json).value())

            //            this.sanitize( document, "operationId" );

            //            this.orderTags( objectMapper, document, "tags" );

            //            this.addLogoUrl( document, "info" );

            this.addTagGroups(document)

            return document
        } catch (e: Exception) {
            log.error("Exception during post-processing of swagger.json file", e)
            return body
        }

    }


    @Throws(JsonProcessingException::class)
    private fun addTagGroups(parent: JsonNode) {
        // Accounts Tag Group
        val contactTags = JsonNodeFactory.instance.arrayNode()
        contactTags.add(SwaggerTags.CONTACTS)

        val contactGroup = JsonNodeFactory.instance.objectNode()
        contactGroup.put("name", "CONTACTS")
        contactGroup.putArray("tags").addAll(contactTags)

        val groups = ArrayList<ObjectNode>()
        groups.add(contactGroup)

        (parent as ObjectNode).putArray("x-tagGroups").addAll(groups)
    }

    companion object {
        private val log = LoggerFactory.getLogger(SwaggerPostProcessorAdvice::class.java)
    }
}