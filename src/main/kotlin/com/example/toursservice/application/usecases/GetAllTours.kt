package com.example.toursservice.application.usecases

import com.example.toursservice.application.models.Tour
import com.example.toursservice.domain.contracts.ToursRepository
import org.springframework.stereotype.Service

@Service
class GetAllTours(
    private val repository: ToursRepository
) {
    fun execute(): List<Tour> {
        return repository.getAllTours()
    }
}