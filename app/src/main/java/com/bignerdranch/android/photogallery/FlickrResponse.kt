package com.bignerdranch.android.photogallery

import com.bignerdranch.android.photogallery.PhotoResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FlickrResponse(
    val photos: PhotoResponse
)
