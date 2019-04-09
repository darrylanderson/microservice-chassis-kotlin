package atc.chassis.api.controller

import atc.chassis.api.model.Contact
import atc.chassis.entity.ContactEntity
import atc.chassis.service.ContactService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/contacts")
class ContactRestController(val contactService: ContactService) {

    @GetMapping("/")
    @PreAuthorize("#oauth2.hasScope('read_contacts')")
    fun getContacts(): ResponseEntity<List<Contact>> {
        log.info("inside GET /contacts")

        val contactEntities = contactService.findContacts()
        val contactModels = contactEntities.map {
            transformEntityToModel(it)
        }

        return ResponseEntity(contactModels, HttpStatus.OK)
    }

    fun transformEntityToModel(entity: ContactEntity): Contact {
        return Contact(
            id = entity.id,
            name = entity.name,
            email = entity.email,
            phone = entity.phone,
            createdDate = entity.createdOn,
            lastModifiedDate = entity.updatedOn
        )
    }

    companion object {
        private val log = LoggerFactory.getLogger(ContactRestController::class.java)
    }
}
