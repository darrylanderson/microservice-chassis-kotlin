package atc.chassis.service

import atc.chassis.entity.ContactEntity
import atc.chassis.repository.ContactRepository
import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ContactService(val contactRepository: ContactRepository) {


    fun createContact(contactEntity: ContactEntity): ContactEntity {
        return contactRepository.save(contactEntity)
    }

    fun findContacts(): Iterable<ContactEntity> {
        return contactRepository.findAll()
    }

    fun findContactByEmail(email: String): Iterable<ContactEntity> {
        return contactRepository.findByEmail(email)
    }

    fun queryContacts(spec: Specification<ContactEntity>): Iterable<ContactEntity> {
        return contactRepository.findAll(spec)
    }
}