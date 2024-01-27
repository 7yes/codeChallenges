package com.yesI.codechallenges

private fun checkPrime(n: Int) {
    var i: Int
    var m = 0
    var flag = 0
    m = n / 2 // to check if the division have a possible value not equals zero

    if (n == 0 || n == 1) {
        println("The number $n is not a prime number")
    } else {
        i = 2
        while (i <= m) {
            if (n % i == 0) {
                println("The number $n is not a prime number")
                flag = 1
                break
            }
            i++
        }
        if (flag == 0) {
            println("The number $n is a prime number")
        }
    }
}

/**
 * function check
 * whether a number
 * is prime or not
 */
fun isPrime(n: Int): Boolean {
    // Corner cases
    if (n <= 1) return false
    if (n <= 3) return true

    // This is checked so
    // that we can skip
    // middle five numbers
    // in below loop
    if (n % 2 == 0 ||
        n % 3 == 0
    ) return false
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 ||
            n % (i + 2) == 0
        ) return false
        i += 6
    }
    return true
}

/**
 * Function to print primes
 */
fun printPrime(n: Int) {
    for (i in 2..n) {
        if (isPrime(i)) print("$i ")
    }
}

// 2Nd Version Primes
//var primes = mutableListOf(2,3)
//val user = 23
//
//fun prime(n : Int)
//{   var isPrime = true
//    for(i in primes)
//    { if(n%i == 0){ //no Prime
//        isPrime = false }
//    }
//    if(isPrime){ primes.add(n)  }
//}
//for(i in 3..user)
//prime(i)
//
//print(primes)