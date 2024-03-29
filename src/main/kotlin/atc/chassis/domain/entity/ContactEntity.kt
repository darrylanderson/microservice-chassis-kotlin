package atc.chassis.domain.entity

import org.springframework.data.annotation.*
import java.time.OffsetDateTime
import javax.persistence.*
import javax.persistence.Id

@Entity
@Table(name = "contact")
class ContactEntity(

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "account_id_gen",
  )
  @SequenceGenerator(
    name = "account_id_gen",
    sequenceName = "account_seq",
    allocationSize = 1,
  )
  var id: Long? = null,

  var name: String = "",

  var email: String = "",

  var phone: String = "",

  @Column(
    nullable = false,
    updatable = false,
  )
  @CreatedDate
  var createdOn: OffsetDateTime = OffsetDateTime.now(),

  @Column(nullable = false)
  @LastModifiedDate
  var updatedOn: OffsetDateTime = OffsetDateTime.now(),

  @Column(
    nullable = true,
    updatable = false,
  )
  @CreatedBy
  var createdBy: String? = null,

  @Column(nullable = true)
  @LastModifiedBy
  var updatedBy: String? = null
)
