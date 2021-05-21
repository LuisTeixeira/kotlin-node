package com.lfmteixeira.common

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect class Math: IMath {

    override fun sqrt(x: Double): Double

}