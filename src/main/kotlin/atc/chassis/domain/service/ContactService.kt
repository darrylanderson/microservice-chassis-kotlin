package atc.chassis.domain.service

import atc.chassis.domain.entity.ContactEntity
import atc.chassis.domain.repository.ContactRepository
import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ContactService(val contactRepository: ContactRepository) {


    fun createContact(contactEntity: ContactEntity): ContactEntity {
        return contactRepository.save(contactEntity)
    }

    fun listContacts(): Iterable<ContactEntity> {
        return contactRepository.findAll()
    }

    fun queryContacts(spec: Specification<ContactEntity>?): Iterable<ContactEntity> {
        return contactRepository.findAll(spec)
    }
}