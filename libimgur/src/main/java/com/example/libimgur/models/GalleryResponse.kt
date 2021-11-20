package com.example.libimgur.models


import com.scaler.libimgur.models.Image
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GalleryResponse(
    @Json(name = "data")
    val `data`: List<Image>,
    @Json(name = "status")
    val status: Int?,
    @Json(name = "success")
    val success: Boolean
)