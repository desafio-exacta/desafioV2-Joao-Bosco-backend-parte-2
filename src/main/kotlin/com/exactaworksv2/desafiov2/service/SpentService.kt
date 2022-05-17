package com.exactaworksv2.desafiov2.service

import com.exactaworksv2.desafiov2.dto.Spent
import com.exactaworksv2.desafiov2.repository.SpentRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class SpentService(
    private val spentRepository: SpentRepository
) {
    fun create(spent: Spent): Mono<Spent> {
        return spentRepository.save(spent)
    }

    fun findAll(): Flux<Spent> {
        return spentRepository.findAll()
    }

}