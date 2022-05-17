package com.exactaworksv2.desafiov2.controller

import com.exactaworksv2.desafiov2.dto.Spent
import com.exactaworksv2.desafiov2.service.SpentService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("api/v1/")
class SpentController(
    private val spentService: SpentService
) {
    @PostMapping("create")
    fun createSpent(@RequestBody spent: Spent): Mono<Spent> {
        return spentService.create(spent)
    }

    @GetMapping("findAll")
    fun listSpents(): Flux<Spent> {
        return spentService.findAll()
    }

}