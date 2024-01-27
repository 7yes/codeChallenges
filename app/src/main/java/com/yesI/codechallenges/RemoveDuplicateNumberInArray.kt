package com.yesI.codechallenges

import java.util.*
import kotlin.collections.HashMap

fun removeDuplicates(arr: IntArray, n: Int): Int {
    if (n == 0 || n == 1) return n

    // To store index of next unique element
    var j = 0

    // Doing same as done in Method 1
    // Just maintaining another updated index i.e. j
    for (i in 0 until n - 1) if (arr[i] != arr[i + 1]) arr[j++] = arr[i]
    arr[j++] = arr[n - 1]
    return j
}

fun removeDuplicatesFromString(string: String) {
    //table to keep track of visited characters
    val table = IntArray(256)
    val chars = string.toCharArray().toMutableSet().toMutableList()

    //to keep track of end index of resultant string
    var endIndex = 0

    chars.forEachIndexed { index, c ->

    }

    for (i in chars.indices) {
        if (table[chars[i].toInt()] == 0) {
            table[chars[i].toInt()] = -1
            chars[endIndex++] = chars[i]
        }
    }
    return
}

fun removeDuplicates(s: CharArray, n: Int): CharArray {
    val exists: MutableMap<Char, Int> = HashMap()
    var st = ""
    for (i in 0 until n) {
        if (!exists.containsKey(s[i])) {
            st += s[i]
            exists[s[i]] = 1
        }
    }
    return st.toCharArray()
}

object RemoveDuplicateNumberInArrayWithOutFunctionsHelp {
    fun sort(arr: IntArray): IntArray {
        for (i in arr.indices) {
            for (j in i + 1 until arr.size) {
                var tmp = 0
                if (arr[i] > arr[j]) {
// swap
                    tmp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = tmp
                }
            }
        }
        return arr
    }


}

fun removeDuplicates2(arr: IntArray, n: Int): Int {
    if (n == 0 || n == 1) return n

    // To store index of next unique element
    var j = 0

    // Doing same as done in Method 1
    // Just maintaining another updated index i.e. j
    for (i in 0 until n - 1) if (arr[i] != arr[i + 1]) arr[j++] = arr[i]
    arr[j++] = arr[n - 1]
    return j
}

fun main(args: Array<String>) {
    val input = intArrayOf(1, 1, 5, 3, 3)
    // val output = RemoveDuplicateNumberInArrayWithOutFunctionsHelp.removeDuplicates(input)

// Sort after get unique values
    // val sortedOutput = RemoveDuplicateNumberInArrayWithOutFunctionsHelp.sort(output)

// Show in the terminal
    println()
}

fun removeDuplicates3(arr: IntArray): Int {
    val n = arr.size
    var j = 0
    for (i in 0 until n - 1) {
        if (arr[i] != arr[i + 1]) {
            arr[j++] = arr[i]
        }
    }
    arr[j++] = arr[n - 1]
    return j
}
