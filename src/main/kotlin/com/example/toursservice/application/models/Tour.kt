package com.example.toursservice.application.models

data class Tour(
    val id: Long? = null,
    val title: String,
    val mainPrice: String,
    val picture: String,
    val overview: String? = null,
    val description: String,
    val destination: String? = null,
    val duration: String? = null,
    val availability: String? = null,
    val detailedPrices: String? = null,
    val inclusion: String? = null,
    val exclusion: String? = null,
    val extraPrices: String? = null,
    val tips: String? = null,
)
