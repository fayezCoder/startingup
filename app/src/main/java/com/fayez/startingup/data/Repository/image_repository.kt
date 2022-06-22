package com.fayez.startingup.data.Repository

import com.fayez.startingup.common.Response
import com.fayez.startingup.data.domin.ImageData
import com.fayez.startingup.data.domin.PicsApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val picsApi: PicsApi
) {

    suspend fun getImage () :List<ImageData>{
        return picsApi.getImages()
    }

    fun getAllImages() : Flow<Response<List<ImageData>>> = flow {
        try {
            emit(Response.Loading<List<ImageData>>())
            val images = getImage()
            emit(Response.Success<List<ImageData>>(images))
        } catch (e:HttpException){
            emit(
                Response.Error<List<ImageData>>(
                    e.localizedMessage ?:"There is some thing wrong"
                )
            )
        } catch (e:IOException){// 3 hours search error HttpException in IOException
            emit(Response.Error<List<ImageData>>("Failed ..to connect to server....."))
        }
    }
}