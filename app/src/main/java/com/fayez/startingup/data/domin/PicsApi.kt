package com.fayez.startingup.data.domin

import retrofit2.http.GET

interface PicsApi {

    @GET("/v2/list")
    suspend fun getImages() : List<ImageData>
}