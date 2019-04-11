package atc.chassis.api.controller

import atc.chassis.api.model.Contact
import atc.chassis.entity.ContactEntity
import atc.chassis.service.ContactService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime


@RestController
@RequestMapping("/contacts")
class ContactRestController(val contactService: ContactService) {

    @GetMapping("/")
    @PreAuthorize("#oauth2.hasScope('read_contacts')")
    fun getContacts(): ResponseEntity<List<Contact>> {
        val contactEntities = contactService.findContacts()
        val contactModels = contactEntities.map {
            transformEntityToModel(it)
        }

        return ResponseEntity(contactModels, HttpStatus.OK)
    }

    @PostMapping("/")
    @PreAuthorize("#oauth2.hasScope('write_contacts')")
    fun createContact(contact: Contact): ResponseEntity<Contact> {
        val contactEntity = transformModelToEntity(contact)
        val savedContactEntity = contactService.createContact(contactEntity)
        val savedContact = transformEntityToModel(savedContactEntity)

        return ResponseEntity(savedContact, HttpStatus.CREATED);
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

    fun transformModelToEntity(model: Contact): ContactEntity {
        return ContactEntity(
            id = model.id,
            name = model.name,
            email = model.email,
            phone = model.phone,
            createdOn = model.createdDate ?: OffsetDateTime.now(),
            updatedOn = model.lastModifiedDate ?: OffsetDateTime.now()
        )
    }

    companion object {
        private val log = LoggerFactory.getLogger(ContactRestController::class.java)
    }
}
