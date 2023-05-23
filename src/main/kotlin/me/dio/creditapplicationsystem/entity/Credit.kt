package me.dio.creditapplicationsystem.entity

import me.dio.creditapplicationsystem.system.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

data class Credit (
    var creditCode: UUID = UUID.randomUUID(),
    val creditValue: BigDecimal = BigDecimal.ZERO,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int = 0,
    val status: Status = Status.IN_PROGRESS,
    var customer: Customer? = null,
    val id: Long? = null
)
