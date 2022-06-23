package com.fayez.startingup.data.domin

import retrofit2.http.GET

interface PicsApi {

    @GET("/v2/list?page=2&limit=100")
    suspend fun getImages() : List<ImageData>
}