package com.yesI.codechallenges

/**
 * This function adds two
 * binary strings and return
 * result as a third string
 */
fun addBinary(a: String, b: String): String {

    // Initialize result
    val result = StringBuilder("")

    // Initialize digit sum
    var s = 0

    // Traverse both strings starting
    // from last characters
    var i = a.length - 1
    var j = b.length - 1
    while (i >= 0 || j >= 0 || s == 1) {

        // Compute sum of last
        // digits and carry
        s += if (i >= 0) a[i] - '0' else 0
        s += if (j >= 0) b[j] - '0' else 0

        // If current digit sum is
        // 1 or 3, add 1 to result
        result.append((s % 2 + '0'.toInt()).toChar())

        // Compute carry
        s /= 2

        // Move to next digits
        i--
        j--
    }

    // Remove leading zeros, if any
    var start = result.length - 1
    while (start >= 0 && result[start] == '0') {
        start--
    }
    if (start != result.length - 1) {
        result.delete(start + 1, result.length)
    }
    return result.reverse().toString()
}