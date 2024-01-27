package com.yesI.codechallenges

/**
 * function to move all zeroes at
 * the end of array
 */
fun moveZerosToEnd(arr: IntArray, n: Int) {
    // Count of non-zero elements
    var count = 0

    // Traverse the array. If arr[i] is non-zero, then
    // update the value of arr at index count to arr[i]
    for (i in 0 until n) if (arr[i] != 0) arr[count++] = arr[i]

    // Update all elements at index >=count with value 0
    for (i in count until n) arr[i] = 0
}