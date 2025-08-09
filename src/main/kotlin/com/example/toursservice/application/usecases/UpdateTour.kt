package com.example.toursservice.application.usecases

import com.example.toursservice.application.exceptions.TourNotFoundException
import com.example.toursservice.application.models.Tour
import com.example.toursservice.application.models.UpdateTourCommand
import com.example.toursservice.domain.contracts.ToursRepository
import org.springframework.stereotype.Service

@Service
class UpdateTour(
    private val repository: ToursRepository
) {
    fun execute(tourId: Long, command: UpdateTourCommand): Tour {
        val tour = repository.getTourById(tourId) ?: throw TourNotFoundException(tourId)
        tour.apply {
            command.title?.let { setTitle(it) }
            command.mainPrice?.let { setMainPrice(it) }
            command.picture?.let { setPicture(it) }
            command.overview?.let { setOverview(it) }
            command.description?.let { setDescription(it) }
            command.destination?.let { setDestination(it) }
            command.duration?.let { setDuration(it) }
            command.availability?.let { setAvailability(it) }
            command.detailedPrices?.let { setDetailedPrices(it) }
            command.inclusion?.let { setInclusions(it) }
            command.exclusion?.let { setExclusions(it) }
            command.extraPrices?.let { setExtraPrices(it) }
            command.tips?.let { setTips(it) }
        }
        return repository.saveTour(tour)
    }
}