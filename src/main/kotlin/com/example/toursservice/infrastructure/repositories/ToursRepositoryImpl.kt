package com.example.toursservice.infrastructure.repositories

import com.example.toursservice.application.models.Tour
import com.example.toursservice.domain.contracts.ToursRepository
import com.example.toursservice.infrastructure.converters.toApplication
import com.example.toursservice.infrastructure.converters.toDbo
import com.example.toursservice.infrastructure.db.ToursDao
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Repository

@Repository
class ToursRepositoryImpl(
    private val toursDao: ToursDao
) : ToursRepository {
    override fun getAllTours(): List<Tour> {
        return toursDao.findAll(Sort.by(Sort.Direction.ASC, "id")).map {
            tourEntity -> tourEntity.toApplication()
        }
    }

    override fun getTourById(id: Long): Tour? {
        return toursDao.findById(id).orElse(null)?.toApplication()
    }

    override fun saveTour(tour: Tour): Tour {
        return toursDao.save(tour.toDbo()).toApplication()
    }

    override fun deleteTour(tour: Tour): Tour {
        TODO("Not yet implemented")
    }
}