package atc.chassis.domain.entity

import org.springframework.data.jpa.domain.Specification
import java.util.*


class ContactEntitySpecificationBuilder {
    private val params: MutableList<SearchCriteria>

    init {
        params = ArrayList()
    }

    fun with(
            key: String,
            operation: String,
            value: Any
    ): ContactEntitySpecificationBuilder {
        params.add(SearchCriteria(key, operation, value))
        return this
    }

    fun build(): Specification<ContactEntity>? {
        if (params.isEmpty()) {
            return null
        }

        val specs = ArrayList<Specification<ContactEntity>>()
        for (param in params) {
            specs.add(AccountDomainSpecification(param))
        }

        var result = specs[0]
        for (i in 1 until specs.size) {
            result = Specification.where(result).and(specs[i])
        }
        return result
    }
}
