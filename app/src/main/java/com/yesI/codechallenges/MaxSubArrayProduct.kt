package com.yesI.codechallenges

import java.util.*
import kotlin.math.min

/* Returns the product
of max product subarray. */
fun maxSubarrayProduct(arr: IntArray, n: Int): Int {
    // max positive product
    // ending at the current position
    var max_ending_here = arr[0]

    // min negative product ending
    // at the current position
    var min_ending_here = arr[0]

    // Initialize overall max product
    var max_so_far = arr[0]
    /* Traverse through the array.
    the maximum product subarray ending at an index
    will be the maximum of the element itself,
    the product of element and max product ending previously
    and the min product ending previously. */
//    for (i in 1 until n) {
//        val temp: Int = max(arrayOf(arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here))
//        min_ending_here = min(arrayOf(arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here))
//        max_ending_here = temp
//        max_so_far = max(max_so_far, max_ending_here)
//    }
    return max_so_far
}

fun longestCommonPrefix(a: Array<String>): String {
    val size = a.size

    /* if size is 0, return empty string */if (size == 0) return ""
    if (size == 1) return a[0]

    /* sort the array of strings */Arrays.sort(a)
    a.sorted()

    /* find the minimum length from first and last string */
    val end = min(a[0].length, a[size - 1].length)

    /* find the common prefix between the first and
           last string */
    var i = 0
    while (i < end && a[0][i] == a[size - 1][i]) i++
    return a[0].substring(0, i)
}