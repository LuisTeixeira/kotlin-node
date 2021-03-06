package com.lfmteixeira.common

class SharedClass(val console: Console, val math: Math) {

    var platform = ""

    fun printMe() {
        console.println("Hello Kotlin!\n\nThis is a shared code between runtimes. Current platform: [$platform]:")
    }

    fun printPrimes(n: Long) {
        for (i in calcPrimes(n)) console.println("$i")
    }

    fun givePrimes(n: Long): List<Long> {
        return calcPrimes(n)
    }

    private fun calcPrimes(n: Long): List<Long> {
        val primes = arrayListOf<Long>()
        if (n > 0) primes.add(2)

        var c = 1
        var p = 3.0

        var prime: Boolean

        while (n > 1) {
            // Check if p is prime
            prime = true
            val sqrt = math.sqrt(p)
            (1..c).filter { primes[it - 1] < sqrt }.forEach {
                if ((p.toLong() % primes[it]) == 0L) {
                    prime = false
                    return@forEach
                }
            }
            // Record p if prime
            if (prime) {
                primes.add(p.toLong())
                c++
                if (c.toLong() == n) {
                    break
                }
            }

            // Next p to check
            p += 2
        }
        return primes.toList()
    }
}