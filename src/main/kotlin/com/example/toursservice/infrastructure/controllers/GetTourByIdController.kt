package com.example.toursservice.infrastructure.controllers

import com.example.toursservice.application.models.Tour
import com.example.toursservice.application.usecases.GetTourById
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RestController
@RequestMapping("/tours")
@Tag(name = "Tours", description = "Tour Management APIs")
class GetTourByIdController(
    private val getTourById: GetTourById
) {
    @Operation(
        summary = "Get tour by ID",
        description = "Retrieve a tour by its unique ID",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Tour found",
                content = [Content(
                    mediaType = "application/json",
                    schema = Schema(implementation = Tour::class)
                )]
            ),
            ApiResponse(
                responseCode = "404",
                description = "Tour not found"
            )
        ]
    )
    @GetMapping("/{id}")
    fun getTourById(@PathVariable id: String): ResponseEntity<Tour> {
        val tour = getTourById.execute(id.toLong())
        return tour?.let { ResponseEntity.ok(it) }
            ?: ResponseEntity.notFound().build()
    }

}