package com.example.toursservice.application.usecases

import com.example.toursservice.application.exceptions.TourNotFoundException
import com.example.toursservice.domain.contracts.ToursRepository
import org.springframework.stereotype.Service

@Service
class DeleteTour(
    private val repository: ToursRepository
) {
    fun execute(tourId: Long) {
        val tour = repository.getTourById(tourId) ?: throw TourNotFoundException(tourId)
        repository.deleteTour(tour.id!!)
    }
}