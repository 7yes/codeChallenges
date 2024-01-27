package com.yesI.codechallenges

/**
 * This method checks if a pair of numbers in
 * the array is equals to the target
 */
fun chkPair(arr: IntArray, target: Int): Boolean {
    for (i in 0 until arr.size - 1) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == target) {
                println(
                    "Pair with a given sum " + target +
                            " is (" + arr[i] + ", " + arr[j] + ")"
                )
                return true
            }
        }
    }
    return false
}