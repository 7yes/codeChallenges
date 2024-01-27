package com.yesI.codechallenges

/**
 * Complete the 'oddNumbers' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 * 1. INTEGER l
 * 2. INTEGER r
 */
fun oddNumbers(l: Int, r: Int): List<Int> {
    val arr = mutableListOf<Int>()

    for (i in l..r) {
        if (i % 2 != 0) {
            arr.add(i)
        }
    }
    return arr
}