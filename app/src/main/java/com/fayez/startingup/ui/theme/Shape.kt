package com.fayez.startingup.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(
        topEnd = 20.dp,
        topStart = 0.dp,
        bottomEnd = 0.dp,
        bottomStart = 20.dp
    ),
    medium = CutCornerShape(
        topStart = 20.dp,
        topEnd = 15.dp,
        bottomStart = 20.dp,
        bottomEnd = 15.dp
    ),
    large = RoundedCornerShape(0.dp)
)