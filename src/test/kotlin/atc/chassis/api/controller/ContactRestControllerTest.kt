package atc.chassis.api.controller

import atc.chassis.api.model.Contact
import atc.chassis.domain.entity.ContactEntity
import atc.chassis.domain.service.ContactService
import com.fasterxml.jackson.databind.ObjectMapper
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
@ActiveProfiles("test")
internal class ContactRestControllerTest(@Autowired val mockMvc: MockMvc) {

  @MockkBean
  private lateinit var contactService: ContactService

  @Autowired
  private lateinit var mapper: ObjectMapper

  @Test
  fun `Test GET Contacts`() {

    // Setup mock service implementation
    val testContactEntity1 = ContactEntity(0, "testcontact1", "testcontact1@email.com", "555-555-5555")
    val testContactEntity2 = ContactEntity(1, "testcontact2", "testcontact2@email.com", "555-555-5555")
    every { contactService.listContacts() } returns listOf(testContactEntity1, testContactEntity2)

    mockMvc.perform(get("/contacts").accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk)
      .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
      .andExpect(jsonPath("\$.[0].name").value(testContactEntity1.name))
      .andExpect(jsonPath("\$.[1].name").value(testContactEntity2.name))
  }

  @Test
  fun `Test POST Contact`() {

    // Setup mock service implementation
    val testContactEntity1 = ContactEntity(0, "testcontact1", "testcontact1@email.com", "555-555-5555")
    val testContactModel1 = Contact(
      name = "testcontact1",
      email = "testcontact1@email.com",
      phone = "555-555-5555",
      id = null,
      createdDate = null,
      lastModifiedDate = null,
    )
    every { contactService.createContact(testContactEntity1) } returns testContactEntity1

    mockMvc.perform(
      post("/contacts")
        .content(mapper.writeValueAsString(testContactModel1))
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .accept(MediaType.APPLICATION_JSON_UTF8),
    )
      .andExpect(status().isCreated)
      .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
      .andExpect(jsonPath("\$.[0].name").value(testContactEntity1.name))
      .andExpect(jsonPath("\$.[1].name").value(testContactModel1.name))
  }
}
