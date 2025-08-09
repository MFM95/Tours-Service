package com.example.toursservice.infrastructure.converters

import com.example.toursservice.application.models.Tour
import com.example.toursservice.application.models.UpdateTourCommand
import com.example.toursservice.infrastructure.controllers.dtos.CreateTourDto
import com.example.toursservice.infrastructure.controllers.dtos.UpdateTourDto
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
    id = this.id,
    title = this.getTitle(),
    mainPrice = this.getMainPrice(),
    picture = this.getPicture(),
    overview = this.getOverview(),
    description = this.getDescription(),
    destination = this.getDestination(),
    duration = this.getDuration(),
    availability = this.getAvailability(),
    detailedPrices = this.getDetailedPrices(),
    inclusion = this.getInclusions(),
    exclusion = this.getExclusions(),
    extraPrices = this.getExtraPrices(),
    tips = this.getTips()
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

fun UpdateTourDto.toApplication() = UpdateTourCommand(
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