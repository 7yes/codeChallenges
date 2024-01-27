package com.yesI.codechallenges

/**
 * This function calculate how many
 * times the mx number and min number is contained into the array
 * and returns the sum of those times it is present
 */
fun maxAndMinNumberRepeatedInArraySumTimes(numbers: IntArray): Int {
    if (numbers.isEmpty()) {
        return 0
    }

    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()

    if (max == min) {
        return numbers.size
    }

    val maxNumberPresent = numbers.count { it == max }
    val minNumberPresent = numbers.count { it == min }

    return maxNumberPresent + minNumberPresent
}

fun maxAndMinNumberAndMultiple(numbers: IntArray, numbers2: IntArray): Int {
    if (numbers.isEmpty() && numbers2.isEmpty()) {
        return 0
    }

    val max = numbers.maxOrNull()
    val min = numbers2.minOrNull()

    if (max == min) {
        return numbers.size
    }

    val maxNumberPresent = numbers.count { it == max }
    val minNumberPresent = numbers.count { it == min }

    return maxNumberPresent + minNumberPresent
}