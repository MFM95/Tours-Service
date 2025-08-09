package com.example.toursservice.application.exceptions

class TourNotFoundException(id: Long) : RuntimeException("Tour with ID $id not found")
