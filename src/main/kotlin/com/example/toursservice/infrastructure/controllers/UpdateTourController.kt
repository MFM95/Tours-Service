package com.example.toursservice.infrastructure.controllers

import com.example.toursservice.application.models.Tour
import com.example.toursservice.application.usecases.UpdateTour
import com.example.toursservice.infrastructure.controllers.dtos.UpdateTourDto
import com.example.toursservice.infrastructure.converters.toApplication
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@Validated
class UpdateTourController(
    private val updateTour: UpdateTour
) {
    @Operation(
        summary = "Update tour",
        description = "Update an existing tour",
        requestBody = io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true, content = [Content(
                mediaType = "application/json", schema = Schema(implementation = UpdateTourDto::class)
            )]
        ),
        responses = [
            ApiResponse(
                responseCode = "200", description = "Tour updated successfully", content = [Content(
                    mediaType = "application/json", schema = Schema(implementation = Tour::class)
                )]
            ),
            ApiResponse(responseCode = "400", description = "Invalid input"),
            ApiResponse(responseCode = "404", description = "Tour not found"),
        ]
    )
    @PutMapping(value = ["/tours/{id}"])
    fun updateTour(
        @PathVariable id: String, @Valid @RequestBody request: UpdateTourDto
    ): ResponseEntity<Tour> {
        println("Incoming request: $request")
        val updatedTour = updateTour.execute(
            tourId = id.toLong(),
            command = request.toApplication()
        )
        return ResponseEntity.status(HttpStatus.OK).body(updatedTour)
    }

}