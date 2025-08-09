package com.example.toursservice.infrastructure.controllers.errorhandler

import java.time.LocalDateTime

data class ApiError(
    val status: Int,
    val error: String,
    val message: String?,
    val path: String,
    val timestamp: LocalDateTime = LocalDateTime.now(),
    val fieldErrors: List<FieldError>? = null
)

data class FieldError(
    val field: String,
    val message: String
)
