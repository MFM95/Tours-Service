package com.example.toursservice.infrastructure.converters

import com.example.toursservice.application.models.Tour
import com.example.toursservice.infrastructure.controllers.dtos.CreateTourDto
import com.example.toursservice.infrastructure.db.models.TourEntity

fun TourEntity.toApplication() = Tour(
    id = this.id,
    title = this.title,
    mainPrice = this.mainPrice,
    picture = this.picture,
    overview = this.overview,
    description = this.description,
    destination = this.destination,
    duration = this.duration,
    availability = this.availability,
    detailedPrices = this.detailedPrices,
    inclusion = this.inclusion,
    exclusion = this.exclusion,
    extraPrices = this.extraPrices,
    tips = this.tips
)

fun Tour.toDbo() = TourEntity(
    title = this.title,
    mainPrice = this.mainPrice,
    picture = this.picture,
    overview = this.overview,
    description = this.description,
    destination = this.destination,
    duration = this.duration,
    availability = this.availability,
    detailedPrices = this.detailedPrices,
    inclusion = this.inclusion,
    exclusion = this.exclusion,
    extraPrices = this.extraPrices,
    tips = this.tips
)

fun CreateTourDto.toApplication() = Tour(
    title = this.title,
    mainPrice = this.mainPrice,
    picture = this.picture,
    overview = this.overview,
    description = this.description,
    destination = this.destination,
    duration = this.duration,
    availability = this.availability,
    detailedPrices = this.detailedPrices,
    inclusion = this.inclusion,
    exclusion = this.exclusion,
    extraPrices = this.extraPrices,
    tips = this.tips
)