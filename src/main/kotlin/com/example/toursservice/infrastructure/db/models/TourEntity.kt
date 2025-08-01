package com.example.toursservice.infrastructure.db.models


import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity
@Table(name = "tours")
class TourEntity {
    @Id
    @SequenceGenerator(name = "baseSequence", sequenceName = "tours_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "baseSequence")
    val id: Long = 0;

    val title: String = "";
    val destination: String? = null;

    @Column(columnDefinition = "TEXT")
    val description: String = "";

    val mainPrice: String = "";

    @Column(columnDefinition = "TEXT")
    val overview: String? = null

    val duration: String? = null
    val availability: String? = null

    @Column(columnDefinition = "TEXT")
    val detailedPrices: String? = null

    @Column(columnDefinition = "TEXT")
    val inclusion: String? = null

    @Column(columnDefinition = "TEXT")
    val exclusion: String? = null

    @Column(columnDefinition = "TEXT")
    val extraPrices: String? = null

    @Column(columnDefinition = "TEXT")
    val tips: String? = null

    @Column(columnDefinition = "TEXT")
    val picture: String = "";

    @Column(
        name = "created_at",
        nullable = false,
        updatable = false
    )
    @CreatedDate
    var createdAt: LocalDateTime = LocalDateTime.now()

    @Column(name = "updated_at")
    @LastModifiedDate
    var updatedAt: LocalDateTime = LocalDateTime.now()
}