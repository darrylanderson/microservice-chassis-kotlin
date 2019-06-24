package atc.chassis.domain.entity

import org.springframework.data.jpa.domain.Specification

import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root


class AccountDomainSpecification(private val criteria: SearchCriteria) : Specification<ContactEntity> {

    override fun toPredicate(
            root: Root<ContactEntity>,
            query: CriteriaQuery<*>,
            builder: CriteriaBuilder
    ): Predicate? {

        when {
            criteria.operation.equals(">", ignoreCase = true) ->
                return builder.greaterThanOrEqualTo(
                        root.get(criteria.key), criteria.value.toString()
                )
            criteria.operation.equals("<", ignoreCase = true) ->
                return builder.lessThanOrEqualTo(
                        root.get(criteria.key), criteria.value.toString()
                )
            criteria.operation.equals(":", ignoreCase = true) ->
                return if (root.get<Any>(criteria.key).javaType == String::class.java) {
                    builder.like(
                            root.get(criteria.key), "%" + criteria.value + "%"
                    )
                } else {
                    builder.equal(root.get<Any>(criteria.key), criteria.value)
                }
            else -> return null
        }
    }
}
