package com.example.toursservice.infrastructure.controllers

import com.example.toursservice.application.models.Tour
import com.example.toursservice.application.usecases.CreateTour
import com.example.toursservice.infrastructure.controllers.dtos.CreateTourDto
import com.example.toursservice.infrastructure.converters.toApplication
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@RestController
@Validated
class CreateTourController(
    private val createTour: CreateTour
) {
    @Operation(
        summary = "Create a new tour",
        description = "Create and persist a new tour in the system",
        requestBody = io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true,
            content = [Content(
                mediaType = "application/json",
                schema = Schema(implementation = CreateTourDto::class)
            )]
        ),
        responses = [
            ApiResponse(
                responseCode = "201", description = "Tour created successfully", content = [Content(
                    mediaType = "application/json",
                    schema = Schema(implementation = Tour::class)
                )]
            ),
            ApiResponse(responseCode = "400", description = "Invalid input")
        ]
    )
    @PostMapping(value = ["/tours"])
    fun createTour(@Valid @RequestBody(required = true) request: CreateTourDto): ResponseEntity<Tour> {
        println("Incoming request: $request")
        val savedTour = createTour.execute(request.toApplication())
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTour)
    }

}