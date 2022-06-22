package com.fayez.startingup.di

import com.fayez.startingup.common.Constants
import com.fayez.startingup.data.Repository.ImageRepository
import com.fayez.startingup.data.domin.PicsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object  AppModule {

    //Api impl
    @Provides    // from hilt library
    @Singleton
    fun providePicsApi(): PicsApi{
        return  Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PicsApi::class.java)
    }
    //repo
    @Provides
    @Singleton
    fun providerRepo(api: PicsApi) : ImageRepository{
        return ImageRepository(picsApi = api)
    }

}