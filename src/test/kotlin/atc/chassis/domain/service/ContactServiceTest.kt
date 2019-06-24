package atc.chassis.domain.service

import atc.chassis.domain.entity.ContactEntity
import atc.chassis.domain.repository.ContactRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
internal class ContactServiceTest @Autowired constructor(
    val entityManager: TestEntityManager,
    val contactRepository: ContactRepository
) {

    @Test
    fun `Test Find All Contacts`() {
        val contactEntity = ContactEntity()
        contactEntity.name = "johnDoe"
        contactEntity.email = "johndoe@email.com"
        contactEntity.phone = "+1.555.555.5555"
        entityManager.persist(contactEntity)
        entityManager.flush()

        contactRepository.findAll()
    }

}