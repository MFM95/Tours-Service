package com.example.toursservice.infrastructure.db.models


import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
@Entity
@Table(name = "tours")
class TourEntity(
    @Id
    @SequenceGenerator(name = "baseSequence", sequenceName = "tours_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "baseSequence")
    var id: Long? = null,
    val title: String,
    val destination: String?,

    @Column(columnDefinition = "TEXT")
    val description: String,

    val mainPrice: String,

    @Column(columnDefinition = "TEXT")
    val overview: String?,

    val duration: String?,
    val availability: String?,

    @Column(columnDefinition = "TEXT")
    val detailedPrices: String?,

    @Column(columnDefinition = "TEXT")
    val inclusion: String?,

    @Column(columnDefinition = "TEXT")
    val exclusion: String?,

    @Column(columnDefinition = "TEXT")
    val extraPrices: String?,

    @Column(columnDefinition = "TEXT")
    val tips: String?,

    @Column(columnDefinition = "TEXT")
    val picture: String,

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now()
)
