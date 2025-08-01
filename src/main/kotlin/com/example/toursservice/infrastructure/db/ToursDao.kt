package com.example.toursservice.infrastructure.db

import com.example.toursservice.infrastructure.db.models.TourEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface ToursDao : JpaRepository<TourEntity, Long> {
    override fun findById(id: Long): Optional<TourEntity?>
}