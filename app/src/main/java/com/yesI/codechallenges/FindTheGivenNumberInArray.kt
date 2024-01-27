package com.yesI.codechallenges

/**
 * Complete the 'findNumber' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 * 1. INTEGER_ARRAY arr
 * 2. INTEGER k
 */
fun findNumber(arr: List<Int>, k: Int): String {
    arr.forEach {
        if (it == k) {
            return "YES"
        }
    }
    return "NO"
}