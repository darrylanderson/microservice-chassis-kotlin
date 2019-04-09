package atc.chassis.api.controller

import atc.chassis.entity.ContactEntity
import atc.chassis.service.ContactService
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@WebMvcTest
@ActiveProfiles("test")
internal class ContactRestControllerTest(@Autowired val mockMvc: MockMvc) {

    @MockkBean
    private lateinit var contactService: ContactService


    @Test
    fun `Test GET Contacts`() {

        // Setup mock service implementation
        val testcontact1 = ContactEntity(0, "testcontact1", "testcontact1@email.com", "555-555-5555")
        val testcontact2 = ContactEntity(1, "testcontact2", "testcontact2@email.com", "555-555-5555")
        every { contactService.findContacts() } returns listOf(testcontact1, testcontact2)

        mockMvc.perform(get("/contacts").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("\$.[0].name").value(testcontact1.name))
            .andExpect(jsonPath("\$.[1].name").value(testcontact2.name))
    }
}