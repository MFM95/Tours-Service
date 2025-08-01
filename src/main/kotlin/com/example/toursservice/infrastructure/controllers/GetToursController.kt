package com.example.toursservice.infrastructure.controllers

import com.example.toursservice.application.models.Tour
import com.example.toursservice.application.usecases.GetAllTours
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RestController
@RequestMapping("/tours")
@Tag(name = "Tours", description = "Tour Management APIs")
class GetToursController(
    private val getToursUseCase: GetAllTours
) {
    @GetMapping
    @Operation(
        summary = "Get all tours",
        description = "Retrieve a list of all available tours",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Successful operation",
                content = [Content(
                    mediaType = "application/json",
                    schema = Schema(implementation = Tour::class)
                )]
            )
        ]
    )
    fun getAllTours(): ResponseEntity<List<Tour>> {
        val tours = getToursUseCase.execute()
        return ResponseEntity.ok(tours)
    }
}