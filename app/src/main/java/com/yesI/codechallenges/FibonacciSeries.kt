package com.yesI.codechallenges

var dp = IntArray(10)

/**
 * This method makes the fibonacci series to the given number
 */
fun fib(n: Int): Int {
    if (n <= 1) return n

    // Temporary variables to store
    // values of fib(n-1) & fib(n-2)
    val first: Int = if (dp[n - 1] != -1) dp[n - 1] else fib(n - 1)
    val second: Int = if (dp[n - 2] != -1) dp[n - 2] else fib(n - 2)

    // Memoization
    return first + second.also { dp[n] = it }
}
