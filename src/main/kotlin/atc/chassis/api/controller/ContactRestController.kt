package atc.chassis.api.controller

import atc.chassis.api.model.Contact
import atc.chassis.api.model.Contacts
import atc.chassis.doc.SwaggerTags
import atc.chassis.domain.entity.ContactEntity
import atc.chassis.domain.entity.ContactEntitySpecificationBuilder
import atc.chassis.domain.service.ContactService
import atc.chassis.exception.BadRequestException
import io.swagger.annotations.*
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*
import java.time.OffsetDateTime
import java.util.regex.Pattern

@RestController
@RequestMapping("/contacts")
interface ContactRestController {

  @ApiOperation(
    value = "List contacts",
    nickname = "listContacts",
    notes = "Returns a list of all contacts.",
    response = Contacts::class,
    authorizations = [
      Authorization(
        value = "OAuth2",
        scopes = [AuthorizationScope(scope = "read:contacts", description = "Ability to read contacts")],
      ),
      Authorization(value = "ApiKey"),
    ],
    tags = [SwaggerTags.CONTACTS],
  )
  @ApiResponses(value = [ApiResponse(code = 200, message = "A list of contacts", response = Contacts::class)])
  @RequestMapping(
    value = ["/contacts"],
    produces = ["application/json"],
    consumes = ["application/json"],
    method = [RequestMethod.GET],
  )
  @PreAuthorize("#oauth2.hasScope('read:contacts')")
  fun listContacts(): ResponseEntity<List<Contact>>

  @ApiOperation(
    value = "Search for contacts",
    nickname = "searchContacts",
    notes = "Search for contacts matching a given set of criteria. This uses a simple query language. \n\n" +
      "To search for a contact by email: /contacts/search?query=email:john.doe@company.com. \n\n" +
      "To search by contact name: /contacts/search?query=name:johndoe. \n\n" +
      "To search by phone number: /contacts/search?query=phone:555-555-5555.",
    response = Contacts::class,
    authorizations = [
      Authorization(
        value = "OAuth2",
        scopes = [AuthorizationScope(scope = "read:contacts", description = "Ability to read contacts")],
      ),
      Authorization(value = "ApiKey"),
    ],
    tags = [SwaggerTags.CONTACTS],
  )
  @ApiResponses(value = [ApiResponse(code = 200, message = "A list of contacts", response = Contacts::class)])
  @RequestMapping(
    value = ["/contacts/search"],
    produces = ["application/json"],
    consumes = ["application/json"],
    method = [RequestMethod.GET],
  )
  fun searchContacts(
    authentication: Authentication,
    @ApiParam(value = "Search query string") @RequestParam(value = "query") query: String
  ): ResponseEntity<Contacts>

  @ApiOperation(
    value = "Create contact",
    nickname = "createContact",
    notes = "Create a new contact",
    response = Contact::class,
    authorizations = [
      Authorization(
        value = "OAuth2",
        scopes = [
          AuthorizationScope(
            scope = "write:contacts",
            description = "Ability to create contacts",
          ),
          AuthorizationScope(scope = "read:contacts", description = "Ability to read contacts"),
        ],
      ),
      Authorization(value = "ApiKey"),
    ],
    tags = [SwaggerTags.CONTACTS],
  )
  @ApiResponses(
    value = [
      ApiResponse(
        code = 201,
        message = "Contact created successfully",
        response = Contact::class,
      ),
    ],
  )
  @ResponseStatus(HttpStatus.CREATED)
  @RequestMapping(
    value = ["/"],
    produces = ["application/json"],
    consumes = ["application/json"],
    method = [RequestMethod.POST],
  )
  @PreAuthorize("#oauth2.hasScope('write_contacts')")
  fun createContact(contact: Contact): ResponseEntity<Contact>
}

class ContactRestControllerImpl(val contactService: ContactService) : ContactRestController {

  override fun listContacts(): ResponseEntity<List<Contact>> {
    val contactEntities = contactService.listContacts()
    val contactModels = contactEntities.map {
      transformEntityToModel(it)
    }
    return ResponseEntity(contactModels, HttpStatus.OK)
  }

  override fun searchContacts(
    authentication: Authentication,
    @ApiParam(value = "Search query string") @RequestParam(value = "query") query: String
  ): ResponseEntity<Contacts> {

    // Build our specifications object to send to the JPA query layer
    val builder = ContactEntitySpecificationBuilder()
    val pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),")
    val matcher = pattern.matcher("$query,")
    while (matcher.find()) {
      val fieldName = matcher.group(1)
      if (!arrayOf("userName", "email", "phone").any { fieldName.contains(it, ignoreCase = true) }) {
        throw BadRequestException(
          "Query string must be against one of the following fields: [name, email, phone]",
        )
      }
      builder.with(fieldName, matcher.group(2), matcher.group(3))
    }

    // Find all matching contacts
    val spec = builder.build()
    val contactEntities = contactService.queryContacts(spec)

    // Convert to our rest model
    val contactModels = contactEntities.map {
      transformEntityToModel(it)
    }
    val contacts = Contacts()
    contacts.addAll(contactModels)

    return ResponseEntity(contacts, HttpStatus.OK)
  }

  override fun createContact(contact: Contact): ResponseEntity<Contact> {
    val contactEntity = transformModelToEntity(contact)
    val savedContactEntity = contactService.createContact(contactEntity)
    val savedContact = transformEntityToModel(savedContactEntity)

    return ResponseEntity(savedContact, HttpStatus.CREATED)
  }

  fun transformEntityToModel(entity: ContactEntity): Contact {
    return Contact(
      id = entity.id,
      name = entity.name,
      email = entity.email,
      phone = entity.phone,
      createdDate = entity.createdOn,
      lastModifiedDate = entity.updatedOn,
    )
  }

  fun transformModelToEntity(model: Contact): ContactEntity {
    val entity = ContactEntity()
    entity.id = model.id
    entity.name = model.name
    entity.email = model.email
    entity.phone = model.phone
    entity.createdOn = model.createdDate ?: OffsetDateTime.now()
    entity.updatedOn = model.lastModifiedDate ?: OffsetDateTime.now()

    return entity
  }

  companion object {
    private val log = LoggerFactory.getLogger(ContactRestController::class.java)
  }
}
