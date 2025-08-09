package com.example.toursservice.application.models

data class UpdateTourCommand(
    val title: String? = null,
    val mainPrice: String? = null,
    val picture: String? = null,
    val overview: String? = null,
    val description: String? = null,
    val destination: String? = null,
    val duration: String? = null,
    val availability: String? = null,
    val detailedPrices: String? = null,
    val inclusion: String? = null,
    val exclusion: String? = null,
    val extraPrices: String? = null,
    val tips: String? = null,
)