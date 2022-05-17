package com.exactaworksv2.desafiov2.repository

import com.exactaworksv2.desafiov2.dto.Spent
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SpentRepository: ReactiveCrudRepository<Spent,Long> {
}