package com.example.toursservice.application.usecases

import com.example.toursservice.application.models.Tour
import com.example.toursservice.domain.contracts.ToursRepository
import org.springframework.stereotype.Service

@Service
class GetTourById(
    private val repository: ToursRepository
) {
    fun execute(id: Long): Tour? {
        return repository.getTourById(id)
    }
}