package com.example.toursservice.infrastructure.controllers.dtos

import jakarta.validation.constraints.NotBlank

data class CreateTourDto (
    @field:NotBlank(message = "Title is required")
    val title: String,
    @field:NotBlank(message = "Main Price is required")
    val mainPrice: String,
    @field:NotBlank(message = "Picture is required")
    val picture: String,
    @field:NotBlank(message = "Description is required")
    val description: String,
    val overview: String? = null,
    val destination: String? = null,
    val duration: String? = null,
    val availability: String? = null,
    val detailedPrices: String? = null,
    val inclusion: String? = null,
    val exclusion: String? = null,
    val extraPrices: String? = null,
    val tips: String? = null,
)