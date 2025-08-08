package com.example.toursservice.application.usecases

import com.example.toursservice.application.models.Tour
import com.example.toursservice.domain.contracts.ToursRepository
import org.springframework.stereotype.Service

@Service
class CreateTour(
    private val repository: ToursRepository
) {
    fun execute(tour: Tour): Tour {
        return repository.addTour(tour)
    }
}