package com.fayez.startingup.ui.imageslist

import com.fayez.startingup.data.domin.ImageData

 data class ImageListState (
    val isLoading : Boolean = false,
    val error:String = "",
    val image : List<ImageData> = emptyList()

)
