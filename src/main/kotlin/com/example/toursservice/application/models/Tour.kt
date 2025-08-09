package com.example.toursservice.application.models

class Tour(
    val id: Long? = null,
    private var  title: String,
    private var  mainPrice: String,
    private var  picture: String,
    private var  overview: String? = null,
    private var  description: String,
    private var  destination: String? = null,
    private var  duration: String? = null,
    private var  availability: String? = null,
    private var  detailedPrices: String? = null,
    private var  inclusion: String? = null,
    private var  exclusion: String? = null,
    private var  extraPrices: String? = null,
    private var  tips: String? = null,
) {
    fun getTitle() = title
    fun getMainPrice() = mainPrice
    fun getPicture() = picture
    fun getOverview() = overview
    fun getDescription() = description
    fun getDestination() = destination
    fun getDuration() = duration
    fun getAvailability() = availability
    fun getDetailedPrices() = detailedPrices
    fun getInclusions() = inclusion
    fun getExclusions() = exclusion
    fun getExtraPrices() = extraPrices
    fun getTips() = tips

    fun setTitle(title: String) {
        this.title = title
    }
    fun setMainPrice(mainPrice: String) {
        this.mainPrice = mainPrice
    }
    fun setPicture(picture: String) {
        this.picture = picture
    }
    fun setOverview(overview: String) {
        this.overview = overview
    }
    fun setDescription(description: String) {
        this.description = description
    }
    fun setDestination(destination: String) {
        this.destination = destination
    }
    fun setDuration(duration: String) {
        this.duration = duration
    }
    fun setAvailability(availability: String) {
        this.availability = availability
    }
    fun setDetailedPrices(detailedPrices: String) {
        this.detailedPrices = detailedPrices
    }
    fun setInclusions(inclusions: String) {
        this.inclusion = inclusions
    }
    fun setExclusions(exclusions: String) {
        this.exclusion = exclusions
    }
    fun setExtraPrices(extraPrices: String) {
        this.extraPrices = extraPrices
    }
    fun setTips(tips: String) {
        this.tips = tips
    }
}
