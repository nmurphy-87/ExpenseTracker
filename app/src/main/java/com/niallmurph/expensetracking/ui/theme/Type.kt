package com.niallmurph.expensetracking.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 22.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 21.sp
    ),
    caption = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 22.sp
    ),
    h1 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 22.sp,
        lineHeight = 34.sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 20.sp,
        lineHeight = 24.sp
    ),
)