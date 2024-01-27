package com.yesI.codechallenges

/**
 * Function that finds the sum of
 * products of all subarray of arr[]
 */
fun sumOfSubarrayProd(arr: IntArray, n: Int) {
    // Stores sum of all subarrays
    var ans = 0
    var res = 0

    // Iterate array from behind
    for (i in n - 1 downTo 0) {
        val incr = arr[i] * (1 + res)

        // Update the ans
        ans += incr

        // Update the res
        res = incr
    }

    // Print the final sum
    println(ans)
}

private fun subarraySum(arr: IntArray, n: Int) {
    var result = 0
    for (i in arr.indices) {
        result += arr[i] + (i + 1) * (arr.size - i)
    }
    println(result/2)
}

fun maxSubarrayProduct(arr: IntArray) {
    // Initializing result
    var result = arr[0]
    val n = arr.size
    for (i in 0 until n) {
        var mul = arr[i]
        // traversing in current subarray
        for (j in i + 1 until n) {
            // updating result every time
            // to keep an eye over the
            // maximum product
            result = Math.max(result, mul)
            mul += arr[j]
        }
        // updating the result for (n-1)th index.
        result = Math.max(result, mul)
    }
    println(result)
    // return result
}