package atc.chassis.domain.repository

import atc.chassis.domain.entity.ContactEntity
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository

interface ContactRepository : CrudRepository<ContactEntity, Long>, JpaSpecificationExecutor<ContactEntity> {
  fun findByEmail(userName: String): Iterable<ContactEntity>
  fun findByPhone(phone: String): Iterable<ContactEntity>
}
