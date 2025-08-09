package com.example.toursservice.infrastructure.controllers

import com.example.toursservice.application.usecases.DeleteTour
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@Validated
class DeleteTourController(
    private val deleteTour: DeleteTour
) {
    @Operation(
        summary = "Delete tour",
        description = "Delete an existing tour",
        responses = [
            ApiResponse(responseCode = "204", description = "No Content, Tour Deleted successfully"),
            ApiResponse(responseCode = "404", description = "Tour not found"),
        ]
    )
    @DeleteMapping(value = ["/tours/{id}"])
    fun deleteTour(
        @PathVariable id: String
    ): ResponseEntity<Void> {
        deleteTour.execute(tourId = id.toLong())
        return ResponseEntity.noContent().build()
    }

}