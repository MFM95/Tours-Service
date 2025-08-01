package com.example.toursservice.domain.contracts

import com.example.toursservice.application.models.Tour

interface ToursRepository {
    fun getAllTours(): List<Tour>
    fun getTourById(id: Long): Tour?
    fun addTour(tour: Tour): Tour
    fun updateTour(tour: Tour): Tour
    fun deleteTour(tour: Tour): Tour
}