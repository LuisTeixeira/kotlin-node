package com.lfmteixeira.common

fun main(vararg args: String) {

}

fun start() {
    val shared = SharedClass(Console(), Math())
    shared.platform = "JavaScript"
    shared.printMe()
    shared.printPrimes(1000)
}