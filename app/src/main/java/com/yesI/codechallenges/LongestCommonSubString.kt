package com.yesI.codechallenges

import java.util.HashSet

fun longestCommonSubstrings(s: String, t: String): Int {
    println(commonSubString(s, t))

    val table = Array(s.length) {
        IntArray(t.length)
    }
    var longest = 0
    val result: MutableSet<String> = HashSet()

    for (i in s.indices) {
        for (j in t.indices) {
            if (s[i] != t[j]) {
                continue
            }
            table[i][j] = if (i == 0 || j == 0) 1 else 1 + table[i - 1][j - 1]
            if (table[i][j] > longest) {
                longest = table[i][j]
                result.clear()
            }
            if (table[i][j] == longest) {
                result.add(s.substring(i - longest + 1, i + 1))
            }
        }
    }
    return result.firstOrNull()?.length ?: 0
}

/**
 * function to return true if strings have
 * common substring and false if strings have
 * no common substring
 */
fun commonSubString(mString1: String, mString2: String): Boolean{
    if (mString1.isEmpty() || mString2.isEmpty()) {
        return false
    }

    // vector for storing character occurrences
    val v = BooleanArray(26).apply {
        fill(false)
        mString1.forEach {
            this[it - 'a'] = true
        }
    }

    // increment vector index for every
    // character of str1

    // for (element in mString1) v[element - 'a'] = true
//    mString1.forEach {
//        v[it - 'a'] = true
//    }

    // checking common substring of str2 in str1
    // for (element in mString2) if (v[element - 'a']) return true
    mString2.forEach {
        if (v[it - 'a']) return true
    }

    return false
}