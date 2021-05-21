package com.lfmteixeira.common

actual class Math : IMath {

    private val mathJs: dynamic = js("Math")

    actual override fun sqrt(x: Double): Double = mathJs.sqrt(x)
}